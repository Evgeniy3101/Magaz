package com.example.Magazin;

// Вспомогательный класс для представления товара
public class Product {
    private final int id;
    private final String name;
    private final String image;
    private final double price;

    public Product(int id, String name, String image, double price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public double getPrice() {
        return price;
    }
}
