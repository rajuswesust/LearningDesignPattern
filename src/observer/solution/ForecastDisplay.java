package observer.solution;

public class ForecastDisplay implements Observer, Display {

    private double temperature;
    //private double humidity;
    private double pressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        //this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void update() {
        //pulling only the necessary states
        temperature = weatherData.getTemperature();
        pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("-----------------------------------");
        System.out.println("Forecast: ");
        System.out.println("Temperature: " + temperature++);
        System.out.println("Pressure: " + pressure++);
        System.out.println("-----------------------------------");
    }
}
