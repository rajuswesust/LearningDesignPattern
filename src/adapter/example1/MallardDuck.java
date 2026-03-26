package adapter.example1;

public class MallardDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("Mallard Duck ::: flying");
    }

    @Override
    public void quack() {
        System.out.println("Mallard Duck ::: quack quack");
    }
}
