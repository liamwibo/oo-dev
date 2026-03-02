package fact.it.tripparserexercise;

import fact.it.tripparserexercise.model.TripParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

import static java.lang.System.exit;

@SpringBootApplication
public class TripparserexerciseApplication {

    public static void main(String[] args) {

        SpringApplication.run(TripparserexerciseApplication.class, args);

        Scanner scan = new Scanner(System.in);

        System.out.println("Pleas enter trip data (format: Start-End-Distance):");
        System.out.println("Example: Paris-Berlin-878.5");
        String tripData = scan.nextLine();
        System.out.println();
        TripParser myTrip = new TripParser(tripData);

        System.out.println("--- Trip Analysis ---");
        System.out.println("From: " + myTrip.getStartCity());
        System.out.println("To: " + myTrip.getEndCity());
        System.out.println("Distance: " + myTrip.getDistance() + " km");
        System.out.println("Estimated Flight Time: " + myTrip.calculateFlightTime() + " hours");
        System.out.println("Trip Code: " + myTrip.generateTripCode());

        exit(0);
    }

}
