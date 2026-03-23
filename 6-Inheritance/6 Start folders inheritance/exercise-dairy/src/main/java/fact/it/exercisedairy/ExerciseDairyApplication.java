package fact.it.exercisedairy;

import fact.it.exercisedairy.model.Dairy;
import fact.it.exercisedairy.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseDairyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseDairyApplication.class, args);
        Product product = new Product(451278, "Coffee Douwe Egberts", 3.51);
        Dairy dairy = new Dairy(719970);
        dairy.setName("Yoghurt BioLine");
        dairy.setUnitPrice(2.36);
        dairy.setNumberOfDays(5);
        dairy.setSupplierCode('A');
        System.out.println(dairy);
        dairy.lowerFreshness();
        dairy.fastSale(5);
        System.out.println(dairy);
        System.exit(0);

    }

}
