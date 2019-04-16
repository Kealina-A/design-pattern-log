package observerp.myself.observer;

import observerp.myself.subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("--ForecastDisplay:\n" +
                "\ttemperature:"+temperature+"\n" +
                "\thumidity:"+humidity+"\n" +
                "\tpressure:"+pressure);
    }
}
