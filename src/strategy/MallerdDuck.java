package strategy;

public class MallerdDuck extends Duck {

    public MallerdDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("Looks like a mallard duck...");
    }
}
