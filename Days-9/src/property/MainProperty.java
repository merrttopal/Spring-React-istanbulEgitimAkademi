package property;

import java.util.ArrayList;

public class MainProperty {
    public static void main(String[] args) {

        ArrayList<String> ls = new ArrayList<>();
        ls.add("Product-1");
        ls.add("Product-2");
        ls.add("Product-3");
        ls.add("Product-4");
        ls.add("Product-5");
        ls.add("Product-6");

        for (String item : ls ){
            System.out.println(item);
        }

       /* Product product = new Product();
        product.setTitle("Product-1");
        product.setPrice(100);
        product.setForexBuy(110);
        product.setStar(4);
        */

        System.out.println("----------------------");
        // Property for ArrayList

        ArrayList<Product> products = new ArrayList<>();
        Product p1 = new Product("TV",12399,11000,5);
        products.add(p1);

        Product p2 = new Product("Tablet",7499,7000,4);
        products.add(p2);

        Product p3 = new Product("iPhone",29000,27000,5);
        products.add(p3);

        Product p4 = new Product();
        p4.setTitle("Samsung");
        p4.setForexBuy(12000);
        p4.setPrice(11499);
        p4.setStar(4);
        products.add(p4);

        ArrayList<String> images = new ArrayList<>();
        images.add("img1.jpg");
        images.add("img2.jpg");
        images.add("img3.jpg");
        images.add("img4.jpg");
        Product p5 = new Product("iMac",77000,76000,5,images);
        products.add(p5);

        System.out.println("Size: "+products.size());

        for (Product item: products) {
            System.out.println(item);

        }

    }
}
