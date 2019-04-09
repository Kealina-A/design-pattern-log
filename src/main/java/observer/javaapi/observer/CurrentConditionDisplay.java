package observer.javaapi.observer;

import observer.javaapi.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("--CurrentConditionDisplay:\n" +
                "\ttemperature: "+temperature+"\n" +
                "\thumidity: "+humidity+"\n" +
                "\tpressure: "+pressure);
    }

    public void update(Observable o, Object arg) {
        if (o != null) {
            WeatherData observable =(WeatherData)o;
            this.temperature = observable.getTemperature();
            this.humidity = observable.getHumidity();
            this.pressure = observable.getPressure();
            display();
        }
    }
}
