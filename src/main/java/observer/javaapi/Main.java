package observer.javaapi;

import observer.javaapi.observer.CurrentConditionDisplay;
import observer.javaapi.observer.ForecastDisplay;
import observer.javaapi.observer.StatisticsDisplay;
import observer.javaapi.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData subject = new WeatherData();

        new CurrentConditionDisplay(subject);
        new ForecastDisplay(subject);
        new StatisticsDisplay(subject);

        subject.setMeasurements(1,2,3);
        System.out.println("--------------");
        subject.setMeasurements(2,3,4);
        System.out.println("--------------");
        subject.setMeasurements(4,5,6);
        System.out.println("--------------");

    }
}
