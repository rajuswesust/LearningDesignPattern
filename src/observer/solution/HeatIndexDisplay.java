package observer.solution;

public class HeatIndexDisplay implements Observer, Display{

    double heatIndex, temperature, humidity;

    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    //we only need temperature and humidity to calculate heat index
    //but Subject is giving also pressure state
    @Override
    public void update(double temperature, double humidity, double pressure) {
        heatIndex = computeHeatIndex(temperature, humidity);
        display();
    }

    @Override
    public void update() {
        //pulling the states
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        heatIndex = computeHeatIndex(temperature, humidity);
        display();
    }

    @Override
    public void display() {
        System.out.println("--------------------------------");
        System.out.println("Feels like: " + heatIndex + "F degrees");
        System.out.println("--------------------------------");
    }

    private double computeHeatIndex(double t, double rh) {
        //converting to Fahrenheit
        t = t*(9.0 / 5.0) + 32;

        heatIndex = (double) ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));

        //converting to Celsius, because nobody reads in Fahrenheit
        return ((heatIndex - 32)/1.8);
    }
}
