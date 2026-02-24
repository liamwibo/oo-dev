package fact.it.runner.model;

public class Runner {

    private String name;
    private int age;
    private double bestPerformance;

    public Runner() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(0, age);
    }

    public double getBestPerformance() {
        return bestPerformance;
    }

    public void setBestPerformance(double bestPerformance) {
        this.bestPerformance = bestPerformance;
    }

    public double getSpeed(){
        return 360 / this.bestPerformance;
    }
}
