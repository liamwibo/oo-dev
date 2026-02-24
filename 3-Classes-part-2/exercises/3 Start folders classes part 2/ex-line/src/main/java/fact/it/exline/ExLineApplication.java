package fact.it.exline;

import fact.it.exline.model.Line;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ExLineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExLineApplication.class, args);
        // write code starting after this line

        //define scanner object
        Scanner scan = new Scanner(System.in);

        //define line object
        Line myLine = new Line();

        //get user input
        System.out.print("Begin punt X: ");
        int beginningX = scan.nextInt();
        System.out.print("Begin punt Y: ");
        int beginningY = scan.nextInt();
        System.out.print("End punt X: ");
        int endX = scan.nextInt();
        System.out.print("End punt X: ");
        int endY = scan.nextInt();
        System.out.print("Thickness: ");
        int thickness = scan.nextInt();

        //set line object variables
        myLine.setThickness(thickness);
        myLine.setBeginningX(beginningX);
        myLine.setBeginningY(beginningY);
        myLine.setEndX(endX);
        myLine.setEndY(endY);

        //output
        System.out.println(myLine.showCharacteristics());

        //end
        System.exit(0);
    }

}
