package fact.it.runner;

import org.springframework.boot.SpringApplication;
import fact.it.runner.model.Runner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunnerApplication.class, args);
        // write code starting after this line

        Runner myRunner = new Runner();

        System.out.println("You created a Runner-object of this class and use its methods in order to show the following values");
        System.out.println(myRunner.getName() + "(" + myRunner.getAge() + " years), best performance on the 100m = " + );


        System.exit(0);
    }

}
