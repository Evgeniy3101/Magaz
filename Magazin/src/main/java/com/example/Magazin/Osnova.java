package com.example.Magazin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;

@Controller
public class Osnova {


        // Метод для отображения страницы интернет-магазина
        @GetMapping("/")
        public String showHomePage(Model model) {
            List<Products> products = getProducts(); // Получаем список товаров
            model.addAttribute("products", products); // Передаем список товаров в модель
            return "Magaz";
        }


    // Метод для отображения страницы товара с указанным ID
        @GetMapping("/products/{id}")
        public String showProductPage(@PathVariable int id, Model model) {
            List<Products> products = getProducts(); // Получаем список товаров
            Products product = Objects.requireNonNull(products).get(id - 1); // Находим товар по ID
            model.addAttribute("products", products); // Передаем товар в модель
            return "products";
        }

    private List<Products> getProducts() {
        return null;
    }

}
