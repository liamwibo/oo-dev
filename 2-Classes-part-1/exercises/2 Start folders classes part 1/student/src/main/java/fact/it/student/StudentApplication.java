package fact.it.student;

import org.springframework.boot.SpringApplication;
import fact.it.student.model.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
        // write code starting after this line

        //define student object
        Student myStudent = new Student();

        //set student object
        myStudent.setName("Jan");
        myStudent.setGrade(2);
        myStudent.setLevel('E');

        //output
        System.out.println("You created a Student-object with the following values:");
        System.out.println(myStudent.getName() + " (grade = " + myStudent.getGrade() + ") currently has level " + myStudent.getLevel() + ". this means:");
        System.out.println(myStudent.getLevelExplained());

        System.exit(0);
    }

}
