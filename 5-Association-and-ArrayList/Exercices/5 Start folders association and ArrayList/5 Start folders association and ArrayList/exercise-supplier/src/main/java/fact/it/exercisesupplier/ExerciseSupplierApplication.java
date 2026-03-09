package fact.it.exercisesupplier;

import fact.it.exercisesupplier.model.Residence;
import fact.it.exercisesupplier.model.Supplier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseSupplierApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseSupplierApplication.class, args);

        Residence residence = new Residence("Berkendreef 24 bus 7", 2000, "Antwerpen");
        Supplier supplier = new Supplier("U&Me", "Jef Perkens", residence);

        System.out.println(supplier.showSupplier());
        System.out.println("Municipality of supplier " + supplier.getName() + ": " + supplier.getResidence().getStreetAndNumber() + ", " + supplier.getResidence().getMunicipality());
        System.out.println("Contact person: " + supplier.getContactPerson());

        System.exit(0);
    }

}
