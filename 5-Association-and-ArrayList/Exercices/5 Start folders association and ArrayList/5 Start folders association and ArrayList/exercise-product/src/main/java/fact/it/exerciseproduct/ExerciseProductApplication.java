package fact.it.exerciseproduct;

import fact.it.exerciseproduct.model.Product;
import fact.it.exerciseproduct.model.Webshop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseProductApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExerciseProductApplication.class, args);

        Webshop webshop = new Webshop("www.nicethingstohave.com");
        Product product1 = new Product("Candle", 10, 6.73);
        Product product2 = new Product("Necklace", 8, 46.35);
        Product product3 = new Product("Bracelet");
        product3.setAmount(25);
        product3.setPrice(13.2);
        Product product4 = new Product("Keyring", 30, 6.7);
        Product product5 = new Product("Dreamcatcher", 100, 4.77);
        webshop.addProduct(product1);
        webshop.addProduct(product2);
        webshop.addProduct(product3);
        webshop.addProduct(product4);
        webshop.addProduct(product5);

        System.out.println("Welcome to my webshop " + webshop.getUrl());
        for (int i = 0; i < webshop.getNumberOfProducts(); i++){
            System.out.println(webshop.showProductFromProductList(i));
        }

        System.exit(0);
    }

}
