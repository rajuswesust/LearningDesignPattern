package factory.factoryMethod.pattern.pizzas;

import factory.factoryMethod.pattern.Pizza;

public class NyStyleVeggiePizza extends Pizza {
    public NyStyleVeggiePizza() {
        name = "New York Veggie Pizza";
        dough = "Thin Crust";
        sauce = "Mariana Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");    }
}
