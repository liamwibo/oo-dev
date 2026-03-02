package fact.it.tripparserexercise.model;

import java.util.Random;

public class TripParser {
    private String tripData;

    public TripParser(String tripData) {
        this.tripData = tripData;
    }

    public String getStartCity(){
        return convertStringDataToList()[0];
    }

    public String getEndCity(){
        return convertStringDataToList()[1];
    }

    public double getDistance(){
        return Double.parseDouble(convertStringDataToList()[2]);
    }

    public int calculateFlightTime(){
        return (int) Math.ceil(Double.parseDouble(convertStringDataToList()[2]) / 900);
    }

    public String generateTripCode(){
        String[] dataList = convertStringDataToList();
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(101,999);
        return dataList[0].substring(0,2).toUpperCase() + randomNumber + dataList[1].substring(dataList[1].length() - 1).toUpperCase();
    }

    private String[] convertStringDataToList(){
        return tripData.split("-");
    }
}
