package fact.it.exercisedateanalyzer;

import fact.it.exercisedateanalyzer.model.DateAnalyzer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseDateAnalyzerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExerciseDateAnalyzerApplication.class, args);

        DateAnalyzer myDate = new DateAnalyzer("15/06/2001");

        System.out.println("You were born on: " + myDate.getDate());

        System.out.println("Day of the month: " + myDate.getNumberedDayOfTheMonth());

        System.out.println("Day of the year: " + myDate.getNumberedDayOfTheYear());

        System.out.println("Weekday: " + myDate.getDayOfWeek());

        System.out.println("Month: " + myDate.getMonth());

        System.out.println("On that day you were 100 days old: " + myDate.get100DaysOld());

        System.out.println("On the day you were 10 months old: " + myDate.get10MonthsOld());

        System.exit(0);
    }

}
