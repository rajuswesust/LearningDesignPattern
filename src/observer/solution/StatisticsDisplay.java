package observer.solution;

public class StatisticsDisplay implements Observer, Display{
    private double temperature;
    private double humidity;
    private double pressure;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
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
        System.out.println("Statistics: ");
        System.out.println("Avg Temperature: " + temperature);
        System.out.println("Min Temperature: " + (temperature - 1));
        System.out.println("Max Temperature: " + (temperature + 1));
        System.out.println("Avg Humidity: " + humidity);
        System.out.println("Min Humidity: " + (humidity - 1));
        System.out.println("Max Humidity: " + (humidity + 1));
        System.out.println("Avg Pressure: " + pressure);
        System.out.println("Min Pressure: " + (pressure - 1));
        System.out.println("Max Pressure: " + (pressure + 1));
        System.out.println("-----------------------------------");
    }
}
