package observer.initialSolution;

public class ForecastDisplay {
    double temperature;
    double humidity;
    double pressure;
    void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    void display() {
        System.out.println("-----------------------------------");
        System.out.println("Forecast: ");
        System.out.println("Temperature: " + temperature++);
        System.out.println("Humidity: " + humidity++);
        System.out.println("Pressure: " + pressure++);
        System.out.println("-----------------------------------");
    }
}
