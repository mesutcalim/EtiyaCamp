package Homework1.StaticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager manager= new ProductManager();
        Product product= new Product();
        product.price=10;
        product.name="Keyboard";

        manager.add(product);

    }
}
