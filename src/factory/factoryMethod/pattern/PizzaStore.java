package factory.factoryMethod.pattern;

import factory.factoryMethod.pattern.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String oderType) {
        Pizza pizza = createPizza(oderType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    public abstract Pizza createPizza(String oderType);
}
