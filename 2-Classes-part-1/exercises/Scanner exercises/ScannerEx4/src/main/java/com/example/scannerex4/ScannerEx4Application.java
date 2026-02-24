package com.example.scannerex4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ScannerEx4Application {

    public static void main(String[] args) {
        SpringApplication.run(ScannerEx4Application.class, args);

        //define scanner class
        Scanner scan = new Scanner(System.in);

        //input
        System.out.print("Day consumption (kWh, only black numbers): ");
        int dayConsumption = scan.nextInt();
        System.out.print("Night consumption (kWh, only black numbers): ");
        int nightConsumption = scan.nextInt();

        //calc
        double fixedAnnualCharge = 83.60;
        double dayRate = 0.146;
        double nightRate = 0.073;
        double vatPercentage = 6;
        double dayPrice = dayConsumption * dayRate;
        double nightPrice = nightConsumption * nightRate;
        double subTotal = dayPrice + nightPrice + fixedAnnualCharge;
        double vatPrice = subTotal / 100 * vatPercentage;
        double totalPrice = vatPrice + subTotal;

        //output
        System.out.println();
        System.out.println("--- Electricity Bill ---");
        System.out.printf("Fixed annual charge %.2f\n", fixedAnnualCharge);
        System.out.printf("Day %d kWh @ €%.3f : € %.2f\n", dayConsumption, dayRate, dayPrice);
        System.out.printf("Night %d kWh @ €%.3f : € %.2f\n", nightConsumption, nightRate, nightPrice);
        System.out.printf("Subtotal : € %.2f\n", subTotal);
        System.out.printf("VAT 6%% : € %.2f\n", vatPrice);
        System.out.printf("TOTAL : € %.2f", totalPrice);

        //end
        System.exit(0);
    }

}
