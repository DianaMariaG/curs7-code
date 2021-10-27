package ro.fasttrackit.curs7;

public class MainProduct {
    public static void main(String[] args) {
        Product product1 = new Product("Salt", 10, 500, "Food");
        Product product2 = new Product("Makeup kit", 100, 0, "Cosmetics");
        Product product3 = new Product("Tennis ball", 30, 700, "Sports");

        System.out.println(product1.getName() + " belongs to " + product1.getCategory() + " category");
        System.out.println("This product costs " + product2.getPrice() + " RON");
        System.out.println("There are still " + product3.getQuantity() + " pieces of this product");

        System.out.println(product2.hasStock());
        System.out.println(product1.isCategory("Food"));
        System.out.println(product2.isCategory("Robotics"));
    }
}
