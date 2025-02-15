package strategy;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("Looks like a model duck...");
    }
}
