package observerp.myself;

import observerp.myself.observer.CurrentConditionDisplay;
import observerp.myself.observer.ForecastDisplay;
import observerp.myself.observer.StatisticsDisplay;
import observerp.myself.subject.WeatherDataSubject;

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
