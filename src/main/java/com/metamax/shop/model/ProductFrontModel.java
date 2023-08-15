package com.metamax.shop.model;

public class ProductFrontModel {
    private long id;
    private String name;
    private BrandFrontModel brand;
    private double price;


    public ProductFrontModel() {
    }

    public ProductFrontModel(long id, String name, BrandFrontModel brand, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BrandFrontModel getBrand() {
        return brand;
    }

    public void setBrand(BrandFrontModel brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
