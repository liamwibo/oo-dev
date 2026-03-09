package fact.it.exercisebeverage.model;

import java.util.stream.Stream;

public class Beverage {
    private String name;
    private double price;
    private int volume;
    private double alcoholPercentage;

    public Beverage() {
    }

    public Beverage(String name, double price, int volume, double alcoholPercentage) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.alcoholPercentage = alcoholPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public boolean isLiquor(){
        return this.alcoholPercentage >= 35;
    }

    public double getPricePerLiter(){
        int volumeInLiters = 1000 / this.volume;
        return volumeInLiters * this.price;
    }
}
