package observerp.javaapi.subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
    private List<Observer> observers = new ArrayList<Observer>();

    private float temperature;
    private float humidity;
    private float pressure;

    public void setMeasurements(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setMeasureChanged();
    }

    public void setMeasureChanged() {
        setChanged();
        //这里不传参表示用的是观察者拉取数据，
        notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
