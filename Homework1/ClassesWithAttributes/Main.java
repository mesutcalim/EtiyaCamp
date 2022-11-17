package Homework1.ClassesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","HP Laptop",1800,3,"Gri");
//        product.setName("Laptop");
//        product.setId(1);
//        product.setDescription("HP Laptop");
//        product.setPrice(1800);
//        product.setStockAmount(2);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}
