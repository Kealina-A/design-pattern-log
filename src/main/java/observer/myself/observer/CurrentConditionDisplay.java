package observer.myself.observer;

import observer.myself.subject.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrentConditionDisplay(Subject subject) {
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
        System.out.println("--CurrentConditionDisplay:\n" +
                "\ttemperature: "+temperature+"\n" +
                "\thumidity: "+humidity+"\n" +
                "\tpressure: "+pressure);
    }
}
