package observer.myself.subject;

import observer.myself.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements Subject{
    private List<Observer> observers = new ArrayList<Observer>();

    private float temperature;
    private float humidity;
    private float pressure;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasureChanged(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
