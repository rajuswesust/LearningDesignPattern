package factory.factoryMethod.initialSolution.pizzaFactories;

import factory.factoryMethod.initialSolution.*;
import factory.factoryMethod.initialSolution.pizzas.*;

public class NyPizzaFactory implements PizzaFactory{
    public Pizza createPizza(String orderType) {
        Pizza pizza;
        if(orderType.equals("cheese")) {
            pizza = new NyCheesePizza();
        }
        else if(orderType.equals("veggie")) {
            pizza = new NyVeggiePizza();
        }
        else if(orderType.equals("claim")) {
            pizza = new NyClamPizza();
        }
        else if(orderType.equals("pepperoni")) {
            pizza = new NyPepperoniPizza();
        }
        else {
            pizza = new SpecialPizza();
        }
        return pizza;
    }
}
