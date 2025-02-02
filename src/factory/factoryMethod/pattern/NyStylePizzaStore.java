package factory.factoryMethod.pattern;

import factory.factoryMethod.pattern.pizzas.*;

public class NyStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza;
        if(orderType.equals("cheese")) {
            pizza = new NyStyleCheesePizza();
        }
        else if(orderType.equals("veggie")) {
            pizza = new NyStyleVeggiePizza();
        }
        else if(orderType.equals("claim")) {
            pizza = new NyStyleClamPizza();
        }
        else if(orderType.equals("pepperoni")) {
            pizza = new NyStylePepperoniPizza();
        }
        else {
            pizza = new SpecialPizza();
        }
        return pizza;
    }
}
