package com.example.demo4.service.Im;

import com.example.demo4.DAO.ProductRepository;
import com.example.demo4.model.Product;
import com.example.demo4.service.ICRUD;

import java.util.ArrayList;

public class ProductService implements ICRUD<Product> {
    private final ProductRepository productRepository = new ProductRepository();

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public ArrayList<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void create(Product product) {
        productRepository.create(product);
    }

    @Override
    public void update(Product product) {
        productRepository.update(product);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }
}
