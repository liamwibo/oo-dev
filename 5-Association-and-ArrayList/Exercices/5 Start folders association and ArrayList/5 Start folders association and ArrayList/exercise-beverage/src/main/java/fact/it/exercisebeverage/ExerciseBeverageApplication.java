package fact.it.exercisebeverage;

import fact.it.exercisebeverage.model.Beverage;
import fact.it.exercisebeverage.model.Customer;
import fact.it.exercisebeverage.model.Purchase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseBeverageApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExerciseBeverageApplication.class, args);
        Customer customer = new Customer(123,"Peter Vergoten");
        Beverage beverage = new Beverage("Famous Grouse whiskey", 14.69, 1000, 38.5);
        Purchase purchase = new Purchase(customer, beverage, 5);

        System.out.println(purchase.showPurchase());
        System.out.println("Customer: " + customer.getName() + " has secret code " + customer.getSecretCode());
        System.out.println("Beverage: " + beverage.getName() + " with alcohol percentage " + beverage.getAlcoholPercentage());
        if (beverage.isLiquor()){
            System.out.println("This beverage is a liquor and costs " + beverage.getPricePerLiter() + " euro per liter");
        }
        System.out.println("Amount purchased: " + purchase.getPurchasedAmount());

        Customer customer2 = new Customer(123,"Peter Vergoten");
        Beverage beverage2 = new Beverage("Jupiler", 0.5, 250, 4.2);
        Purchase purchase2 = new Purchase(customer2, beverage2, 50);

        System.out.println(purchase2.showPurchase());
        System.out.println("Customer: " + customer2.getName() + " has secret code " + customer2.getSecretCode());
        System.out.println("Beverage: " + beverage2.getName() + " with alcohol percentage " + beverage2.getAlcoholPercentage());
        if (beverage2.isLiquor()){
            System.out.println("This beverage is a liquor and costs " + beverage2.getPricePerLiter() + " euro per liter");
        }
        System.out.println("Amount purchased: " + purchase2.getPurchasedAmount());


        System.exit(0);
    }

}
