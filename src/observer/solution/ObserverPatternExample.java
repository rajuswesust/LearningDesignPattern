package observer.solution;

public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        //simulate new weather measurements
        weatherData.setMeasurements(20.0, 75, 1012);
        weatherData.setMeasurements(20.5, 74.5, 1012);
    }
}
