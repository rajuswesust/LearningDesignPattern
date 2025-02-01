package factory.simpleFactory;

public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;
    public PizzaStore() {
        simplePizzaFactory = new SimplePizzaFactory();
    }
    public Pizza orderPizza(String oderType) {
        Pizza pizza = simplePizzaFactory.createPizza(oderType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
