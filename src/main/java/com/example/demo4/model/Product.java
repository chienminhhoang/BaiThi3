package com.example.demo4.model;

public class Product {
    private int id;
    private String name;
    private int amount;
    private String color;
    private String description;
    private Category category;
    private double price;

    public Product() {
    }

    public Product(String name, int amount, String color, String description, Category category, double price) {
        this.name = name;
        this.amount = amount;
        this.color = color;
        this.description = description;
        this.category = category;
        this.price = price;
    }

    public Product(int id, String name, int amount, String color, String description, Category category, double price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.color = color;
        this.description = description;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
