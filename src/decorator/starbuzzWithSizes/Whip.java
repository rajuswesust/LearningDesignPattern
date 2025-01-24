package decorator.starbuzzWithSizes;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == SIZE.TALL) {
            cost += .10;
        } else if (beverage.getSize() == SIZE.GRANDE) {
            cost += .15;
        } else if (beverage.getSize() == SIZE.VENTI) {
            cost += .20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
