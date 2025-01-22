package strategy;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallerdDuck = new MallerdDuck();
        mallerdDuck.performFly();
        mallerdDuck.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();

        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
