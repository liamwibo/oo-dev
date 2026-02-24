package fact.it.exrefuelling;

import fact.it.exrefuelling.model.Refuelling;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ExRefuellingApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExRefuellingApplication.class, args);
        // write code starting after this line

        //define scanner object
        Scanner scan = new Scanner(System.in);

        //input
        System.out.print("Previous Mileage: ");
        int previousMileage = scan.nextInt();
        System.out.print("Current Mileage: ");
        int currentMileage = scan.nextInt();
        System.out.print("Amount in liters: ");
        double amountInLiters = scan.nextDouble();

        //define refuelling object
        Refuelling myRefuelling = new Refuelling(previousMileage, currentMileage, amountInLiters);

        //output
        System.out.println("Your fuel consumption was " + myRefuelling.getFuelConsumption() + " liters.");

        //end
        System.exit(0);

    }

}
