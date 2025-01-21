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
            observer.update(temperature, humidity, pressure);
        }
    }

    void measurementChanged() {
        notifyObservers();
    }

//    void setTemperature(double temperature) {
//        this.temperature = temperature;
//    }
//
//    void setPressure(double pressure) {
//        this.pressure = pressure;
//    }
//
//    void setHumidity(double humidity) {
//        this.humidity = humidity;
//    }

    //
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
