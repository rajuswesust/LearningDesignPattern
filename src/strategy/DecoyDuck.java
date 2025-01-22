package strategy;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    @Override
    public void display() {
        System.out.println("looks like a decoy duck...");
    }
}
