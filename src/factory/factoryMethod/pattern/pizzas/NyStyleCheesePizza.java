package factory.factoryMethod.pattern.pizzas;

import factory.factoryMethod.pattern.Pizza;

public class NyStyleCheesePizza extends Pizza {
    public NyStyleCheesePizza() {
        name = "New York Style Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Mariana Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
