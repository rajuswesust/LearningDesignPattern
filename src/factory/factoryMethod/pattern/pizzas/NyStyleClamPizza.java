package factory.factoryMethod.pattern.pizzas;

import factory.factoryMethod.pattern.Pizza;

public class NyStyleClamPizza extends Pizza {
    public NyStyleClamPizza() {
        name = "New York Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}
