package com.example.Magazin;

import java.util.ArrayList;
import java.util.List;

public class Products {
    public Products(int id, String name, String image, double price) {

    }

    // Вспомогательный метод для получения списка товаров
    private List<Products> getProducts() {
        List<Products> products = new ArrayList<>();
        // Добавьте свои товары сюда
        products.add(new Products(1, "Товар 1", "1.jpg", 500.00));
        products.add(new Products(2, "Товар 2", "2.png", 250.00));
        products.add(new Products(3, "Товар 3", "3.png", 300.00));
        products.add(new Products(4, "Товар 4", "4.jpg", 400.00));
        return products;
    }
}
