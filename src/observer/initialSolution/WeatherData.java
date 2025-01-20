package observer.initialSolution;

public class WeatherData {

    CurrentConditionDisplay currentConditionDisplay;
    StatisticsDisplay statisticsDisplay;
    ForecastDisplay forecastDisplay;

    public WeatherData() {
        currentConditionDisplay = new CurrentConditionDisplay();
        statisticsDisplay = new StatisticsDisplay();
        forecastDisplay = new ForecastDisplay();
    }
    public double getTemperature() {
        return 19.0; //celsius
    }

    public double getHumidity() {
        return 59.1; //percent
    }

    public double getPressure() {
        return 1013; //mbar
    }

    public void measurementChanged() {
        currentConditionDisplay.update(getTemperature(), getHumidity(), getPressure());
        statisticsDisplay.update(getTemperature(), getHumidity(), getPressure());
        forecastDisplay.update(getTemperature(), getHumidity(), getPressure());
    }

    //other methods
}
