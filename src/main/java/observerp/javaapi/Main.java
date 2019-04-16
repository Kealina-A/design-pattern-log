package observerp.javaapi;

import observerp.javaapi.observer.CurrentConditionDisplay;
import observerp.javaapi.observer.ForecastDisplay;
import observerp.javaapi.observer.StatisticsDisplay;
import observerp.javaapi.subject.WeatherData;

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
