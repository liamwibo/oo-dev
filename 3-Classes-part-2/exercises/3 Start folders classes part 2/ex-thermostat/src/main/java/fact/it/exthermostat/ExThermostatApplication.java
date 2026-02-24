package fact.it.exthermostat;

import fact.it.exthermostat.model.Thermostat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExThermostatApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExThermostatApplication.class, args);
        // write code starting after this line

        Thermostat thermostat = new Thermostat(20, 30, 10, 2);

        // Original methods
        thermostat.warmer();
        System.out.println("Current temperature: " + thermostat.getTemperature());

        // Overloaded methods
        System.out.println(thermostat.warmer(5));
        System.out.println(thermostat.colder(8));
        System.out.println(thermostat.colder(50));

        System.exit(0);
    }

}
