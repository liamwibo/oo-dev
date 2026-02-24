package fact.it.exthermostat.model;

public class Thermostat {
    private int temperature;
    private int maxTemp;
    private int minTemp;
    private int increment;

    public Thermostat(int temperature, int maxTemp, int minTemp, int increment) {
        this.maxTemp = Math.max(maxTemp, minTemp);
        this.minTemp = Math.min(maxTemp, minTemp);
        if(temperature >= this.minTemp && temperature <= this.maxTemp){
            this.temperature = temperature;
        }
        else{
            this.temperature = (this.minTemp + this.maxTemp) / 2;
        }
        this.increment = Math.abs(increment);
    }

    public int getTemperature() {
        return temperature;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = Math.abs(increment);
    }

    public void warmer(){
        this.temperature = Math.min(this.temperature + increment, this.maxTemp);
    }

    public void colder(){
        this.temperature = Math.max(this.temperature - increment, this.minTemp);
    }

    public String warmer(int amount) {
        int oldTemp = this.temperature;
        int step = Math.abs(amount);

        this.temperature = Math.min(this.temperature + step, this.maxTemp);

        return "Temperature increased from " + oldTemp + " to " + this.temperature;
    }

    public String colder(int amount) {
        int oldTemp = this.temperature;
        int step = Math.abs(amount);

        this.temperature = Math.max(this.temperature - step, this.minTemp);

        return "Temperature decreased from " + oldTemp + " to " + this.temperature;
    }
}
