package factory.factoryMethod.initialSolution;

import factory.factoryMethod.initialSolution.pizzaFactories.ChicagoPizzaFactory;
import factory.factoryMethod.initialSolution.pizzaFactories.NyPizzaFactory;

public class Customer {
    public static void main(String[] args) {
        PizzaFactory nyPizzaFactory = new NyPizzaFactory();
        PizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();

        PizzaStore nyPizzaStore = new PizzaStore(nyPizzaFactory);
        PizzaStore chicagoStore = new PizzaStore(chicagoPizzaFactory);

        Pizza order1 = nyPizzaStore.orderPizza("veggie");
        Pizza order2 = chicagoStore.orderPizza("cheese");
    }
}
