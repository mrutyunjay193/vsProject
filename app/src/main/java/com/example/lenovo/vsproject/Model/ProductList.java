package com.example.lenovo.vsproject.Model;

public class ProductList {
    private String name;
    private int image;
    private  String brand;
    private double price;

    public ProductList(String name, int image, String brand, double price) {
        this.name = name;
        this.image = image;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
