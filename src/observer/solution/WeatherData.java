package observer.solution;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    List<Observer> observerList;
    double temperature;
    double pressure;
    double humidity;

    public WeatherData() {
        observerList = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observerList) {
            //pushing the ALL states to the observers
            //observer.update(temperature, humidity, pressure);

            //just notifying
            observer.update();
        }
    }

    void measurementChanged() {
        notifyObservers();
    }

    //Weather station will give the data by calling this setter method
    void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    double getTemperature() {
        return temperature;
    }

    double getPressure() {
        return pressure;
    }

    double getHumidity() {
        return humidity;
    }

    //other methods here
}
