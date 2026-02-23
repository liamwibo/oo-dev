package fact.it.scannerex2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ScannerEx2Application {

    public static void main(String[] args) {
        SpringApplication.run(ScannerEx2Application.class, args);

        //define scanner class
        Scanner scan = new Scanner(System.in);

        //input
        System.out.print("Current exchange rate (1 EUR = ? USD): ");
        double rate = scan.nextDouble();
        System.out.print("Amount in EUR: ");
        double euros = scan.nextDouble();
        double usd = euros * rate;

        //output
        System.out.printf("%.2f EUR = %.2f USD (rate: %.4f)%n", euros, usd, rate);

        //end program
        System.exit(0);


    }

}
