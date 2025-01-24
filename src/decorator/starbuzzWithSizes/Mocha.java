package decorator.starbuzzWithSizes;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == SIZE.TALL) {
            cost += .15;
        } else if (beverage.getSize() == SIZE.GRANDE) {
            cost += .20;
        } else if (beverage.getSize() == SIZE.VENTI) {
            cost += .25;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
