package Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Shop {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void sortProductsByPrice() {
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice));
    }

    public Product getMostExpensiveProduct() {
        return Collections.max(products, Comparator.comparingDouble(Product::getPrice));
    }
}

class ShopTest {
    public static void main(String[] args) {
        // Создаем магазин
        Shop shop = new Shop();

        // Создаем продукты
        Product apple = new Product("Apple", 2.5);
        Product banana = new Product("Banana", 1.8);
        Product orange = new Product("Orange", 3.2);

        // Добавляем продукты в магазин
        shop.addProduct(apple);
        shop.addProduct(banana);
        shop.addProduct(orange);

        // Проверяем, что магазин хранит верный список продуктов
        List<Product> products = shop.getProducts();
        System.out.println(products.size()); // Ожидаемый результат: 3
        for (Product product : products) {
            System.out.println(product.getName()); // Ожидаемый результат: Apple, Banana, Orange
        }

        // Проверяем корректность работы метода getMostExpensiveProduct
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        System.out.println(mostExpensiveProduct.getName()); // Ожидаемый результат: Orange

        // Проверяем корректность работы метода sortProductsByPrice
        shop.sortProductsByPrice();
        products = shop.getProducts();
        for (Product product : products) {
            System.out.println(product.getName()); // Ожидаемый результат: Banana, Apple, Orange
        }
    }
}