package factory.factoryMethod.initialSolution.pizzaFactories;

import factory.factoryMethod.initialSolution.*;
import factory.factoryMethod.initialSolution.pizzas.*;

public class ChicagoPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza;
        if(orderType.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        }
        else if(orderType.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        }
        else if(orderType.equals("claim")) {
            pizza = new ChicagoClamPizza();
        }
        else if(orderType.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza();
        }
        else {
            pizza = new SpecialPizza();
        }
        return pizza;
    }
}
