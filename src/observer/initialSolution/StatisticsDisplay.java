package observer.initialSolution;public class StatisticsDisplay {
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
