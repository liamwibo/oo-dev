package fact.it.exerciserandomgenerator.model;

import java.util.Random;

public class RandomGenerator {
    private int minimum;
    private int maximum;

    public RandomGenerator() {
        this.minimum = 1;
        this.maximum = 5;
    }

    public RandomGenerator(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getRandom(){
        Random rnd = new Random();
        return rnd.nextInt(this.minimum,this.maximum + 1);
    }
}
