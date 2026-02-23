package fact.it.scannerex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ScannerEx1Application {

    public static void main(String[] args) {
        SpringApplication.run(ScannerEx1Application.class, args);

        //define scanner object
        Scanner scan = new Scanner(System.in);

        //input
        System.out.print("First name: ");
        String firstName = scan.nextLine();
        System.out.print("Last name: ");
        String lastName = scan.nextLine();
        System.out.print("Street: ");
        String street = scan.nextLine();
        System.out.print("House number: ");
        String houseNumber = scan.nextLine();
        System.out.print("ZIP code: ");
        String zipCode = scan.nextLine();
        System.out.print("City: ");
        String city = scan.nextLine();

        //output
        System.out.println();
        System.out.println("--- Address label using + ---");
        System.out.println(firstName + " " + lastName);
        System.out.println(street + " " + houseNumber);
        System.out.println(zipCode + " " + city);

        //end program
        System.exit(0);


    }


}
