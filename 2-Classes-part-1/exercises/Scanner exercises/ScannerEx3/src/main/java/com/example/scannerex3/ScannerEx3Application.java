package com.example.scannerex3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ScannerEx3Application {

    public static void main(String[] args) {
        SpringApplication.run(ScannerEx3Application.class, args);

        //define scanner class
        Scanner scan = new Scanner(System.in);

        //input
        System.out.print("Temperature in °C: ");
        double tempC = scan.nextDouble();

        //calc
        double tempF = tempC * 9/5 + 32;

        //output
        System.out.printf("%.2f °C = %.2f °F", tempC, tempF);

        //end
        System.exit(0);

    }

}
