package factory.factoryMethod.initialSolution;

public class PizzaStore {
    PizzaFactory pizzaFactory;
    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }
    public Pizza orderPizza(String oderType) {
        Pizza pizza = pizzaFactory.createPizza(oderType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
