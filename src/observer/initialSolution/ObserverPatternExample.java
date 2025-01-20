package observer.initialSolution;

public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.measurementChanged();
    }
}
