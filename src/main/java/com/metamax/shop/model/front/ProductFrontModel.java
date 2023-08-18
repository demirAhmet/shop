package com.metamax.shop.model.front;

public class ProductFrontModel {
    private long id;
    private String name;
    private BrandFrontModel brand;
    private double price;

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
