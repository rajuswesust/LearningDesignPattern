package decorator.starbuzzWithSizes;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();

    public SIZE getSize() {
        return beverage.getSize();
    }
}
