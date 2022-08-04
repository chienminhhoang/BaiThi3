package com.example.demo4.DAO;

import com.example.demo4.connection.MyConnection;
import com.example.demo4.model.Category;
import com.example.demo4.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductRepository {
    private final MyConnection myConnection = new MyConnection();
    private final CategoryRepository categoryRepository = new CategoryRepository();
    private final String SELECT_ALL_PRODUCT = "select * from product";
    private final String INSERT_PRODUCT = "insert into product(name, price, quantity, description, category_id)" +
            "value(?,?,?,?,?)";
    private final String DELETE_PRODUCT_BY_ID = "delete from product where id = ?";
    private final String SELECT_PRODUCT_BY_ID = "select * from product where id = ?";
    private final String UPDATE_PRODUCT = "update product set name = ?, price = ?, quantity = ?," +
            "description = ?, category_id = ? where id = ?";
    private Product getProduct(int id, ResultSet resultSet) throws SQLException {
        String name = resultSet.getString("name_product");
        double price = resultSet.getDouble("price");
        int amount = resultSet.getInt("amount");
        String description = resultSet.getString("description");
        int categoryId = resultSet.getInt("id_category");
        Category category = categoryRepository.findById(categoryId);
        String color = resultSet.getString("color");
       return new Product(name,amount,color,description,category,price);
    }

    public Product findById(int id) {
        try {
            Connection connection = myConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return getProduct(id, resultSet);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
    public void create(Product product) {
        try {
            PreparedStatement preparedStatement = getPreparedStatement(INSERT_PRODUCT, product);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());;
        }
    }
    public ArrayList<Product> findAll() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            Connection connection = myConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                Product product =  getProduct(id, resultSet);
                products.add(product);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());;
        }
        return products;
    } public void update(Product product) {
        try {
            PreparedStatement preparedStatement = getPreparedStatement(UPDATE_PRODUCT, product);
            preparedStatement.setInt(7, product.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());;
        }
    }
    private PreparedStatement getPreparedStatement(String SQL, Product product) throws SQLException {
        Connection connection = myConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        preparedStatement.setString(1, product.getName());
        preparedStatement.setDouble(2, product.getPrice());
        preparedStatement.setInt(3, product.getAmount());
        preparedStatement.setString(4, product.getDescription());
        preparedStatement.setInt(5, product.getCategory().getId());
        preparedStatement.setString(6, product.getColor());
        return preparedStatement;
    }
    public void deleteById(int id) {
        try {
            Connection connection = myConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT_BY_ID);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());;
        }
    }

}
