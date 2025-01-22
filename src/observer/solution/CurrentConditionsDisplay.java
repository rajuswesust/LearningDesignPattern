package observer.solution;

import java.awt.font.TextHitInfo;

public class CurrentConditionsDisplay implements Observer, Display {
    private double temperature;
    private double humidity;
    private double pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void update() {
        //pulling all states
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("-----------------------------------");
        System.out.println("Current Whether Condition: ");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
        System.out.println("-----------------------------------");
    }
}
