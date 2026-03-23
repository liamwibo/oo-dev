package fact.it.exercisepatient;

import fact.it.exercisepatient.model.Consultation;
import fact.it.exercisepatient.model.Doctor;
import fact.it.exercisepatient.model.Patient;
import fact.it.exercisepatient.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@SpringBootApplication
public class ExercisePatientApplication {

    public static void main(String[] args) {
        System.out.println("Part 1:");
        SpringApplication.run(ExercisePatientApplication.class, args);
        //write your code here
        Doctor doctor = new Doctor("Leo Lebon", "Cardiologist");
        Patient patient = new Patient("Tom Verlaet", "750510 105M16");
        Consultation consultation = new Consultation(doctor, patient);
        System.out.println(consultation);

        System.out.println("2a: (no polymorphism)");
        Doctor doctor1 = new Doctor("Doctor 1", "Cardiologist");
        Doctor doctor2 = new Doctor("Doctor 2", "Surgeon");
        Patient patient1 = new Patient("Patient 1", "750549 105M16");
        Patient patient2 = new Patient("Patient 2", "750510 105M34");
        System.out.println(doctor1);
        System.out.println(doctor2);
        System.out.println(patient1);
        System.out.println(patient2);

        System.out.println("2b: (polymorphism)");
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(doctor1);
        personList.add(doctor2);
        personList.add(patient1);
        personList.add(patient2);
        Collections.shuffle(personList);

        for (Person person : personList){
            System.out.println(person);
        }

        System.exit(0); }

}
