package observer.myself;

import observer.myself.observer.CurrentConditionDisplay;
import observer.myself.observer.ForecastDisplay;
import observer.myself.observer.StatisticsDisplay;
import observer.myself.subject.WeatherDataSubject;

public class Main {
    public static void main(String[] args) {
        WeatherDataSubject subject = new WeatherDataSubject();

        new CurrentConditionDisplay(subject);
        new ForecastDisplay(subject);
        new StatisticsDisplay(subject);

        subject.setMeasureChanged(1,2,3);
        System.out.println("--------------");
        subject.setMeasureChanged(2,3,4);
        System.out.println("--------------");
        subject.setMeasureChanged(4,5,6);
        System.out.println("--------------");

    }
}
