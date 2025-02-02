package factory.factoryMethod.initialSolution;

public abstract class Pizza {

    public String name;
    public void prepare() {
        System.out.println("Preparing " + name + "....");
    }

    public void bake() {
        System.out.println("Baking for 25 minutes...");
    }

    public void cut() {
        System.out.println("Cutting....");
    }

    public void box() {
        System.out.println("Pizza is putting inside the PizzaStore box...\n");
    }

}
