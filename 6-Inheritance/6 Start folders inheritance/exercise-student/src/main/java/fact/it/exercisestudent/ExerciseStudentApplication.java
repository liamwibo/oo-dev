package fact.it.exercisestudent;

//import fact.it.exercisestudent.model.DormStudent;
import fact.it.exercisestudent.model.DormStudent;
import fact.it.exercisestudent.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseStudentApplication.class, args);
        //write your code here
        Student student = new Student("Laura Wilkens", "r0689478");
        student.setMajor("Applied Informatics");
        student.setAddress("Veldstraat 4 - 2200 Herentals");
        DormStudent dormStudent = new DormStudent("Ben Lievens", "r075163", " Hoofdstraat 33 - 2440 Geel");
        dormStudent.setDormLandlord("Maurice Geuns");
        dormStudent.setAddress("Langstraat 9 - 2150 Borsbeek");
        dormStudent.setMajor("Electronics-ICT");

        System.out.println(student);
        System.out.println(dormStudent);

        System.exit(0);

    }

}
