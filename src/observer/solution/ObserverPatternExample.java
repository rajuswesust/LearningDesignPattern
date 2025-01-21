package observer.solution;

public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        //adding new display
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        //simulate new weather measurements
        weatherData.setMeasurements(20.0, 86, 1012);
        weatherData.setMeasurements(20.5, 86.5, 1012);
    }
}
