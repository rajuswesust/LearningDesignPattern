package factory.factoryMethod.pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    public String name;
    public String dough;
    public String sauce;
    public List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name + "....");
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping: toppings) {
            System.out.println(topping + " ");
        }
    }

    public void bake() {
        System.out.println("Baking for 25 minutes...");
    }

    public void cut() {
        System.out.println("Cutting the pizza in diagonal slices....");
    }

    public void box() {
        System.out.println("Pizza is putting inside the PizzaStore box...\n");
    }
    public String getName() {
        return this.name;
    }

}
