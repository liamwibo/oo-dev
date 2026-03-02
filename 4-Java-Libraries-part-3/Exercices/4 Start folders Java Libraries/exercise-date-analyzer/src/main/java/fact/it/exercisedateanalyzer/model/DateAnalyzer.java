package fact.it.exercisedateanalyzer.model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAnalyzer {
    private LocalDate date;

    public DateAnalyzer(String date) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        this.date = LocalDate.parse(date,dtf);
    }

    public String getDate(){
        return convertDateToString(this.date);
    }

    public int getNumberedDayOfTheYear(){
        return this.date.getDayOfYear();
    }

    public int getNumberedDayOfTheMonth(){
        return this.date.getDayOfMonth();
    }

    public DayOfWeek getDayOfWeek(){
        return this.date.getDayOfWeek();
    }

    public Month getMonth(){
        return this.date.getMonth();
    }

    public String get100DaysOld(){
        return convertDateToString(this.date.plusDays(100));
    }

    public String get10MonthsOld(){
        return convertDateToString(this.date.plusMonths(10));
    }

    private String convertDateToString(LocalDate dateToConvert){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-M-yyyy");
        return dateToConvert.format(dtf);
    }
}
