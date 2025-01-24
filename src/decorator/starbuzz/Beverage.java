package decorator.starbuzz;

public abstract class Beverage {
    String description = "UNKNOWN BEVERAGE";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
