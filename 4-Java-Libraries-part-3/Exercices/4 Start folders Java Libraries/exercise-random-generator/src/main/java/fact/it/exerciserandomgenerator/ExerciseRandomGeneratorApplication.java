package fact.it.exerciserandomgenerator;

import fact.it.exerciserandomgenerator.model.RandomGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseRandomGeneratorApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExerciseRandomGeneratorApplication.class, args);

        RandomGenerator myRandom = new RandomGenerator(-50, 50);

        System.out.println("Random numbers between " + myRandom.getMinimum() + " and " + myRandom.getMaximum());
        for (int i = 0; i < 10; i++){
            System.out.print(myRandom.getRandom() + " ");
        }

        System.exit(0);
    }

}
