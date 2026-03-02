package fact.it.exercisepasswordchecker;

import fact.it.exercisepasswordchecker.model.PasswordChecker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercisePasswordCheckerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExercisePasswordCheckerApplication.class, args);

        PasswordChecker myPassword = new PasswordChecker();

        myPassword.setPassword("Password123");

        System.out.println("The password is: " + myPassword.getPassword());

        System.out.println("Encrypted password: " + myPassword.encrypt());

        System.out.println("Number of uppercase letters: " + myPassword.countUppercase());

        System.out.println("Password safety: " + myPassword.checkSafety());

        System.exit(0);
    }

}
