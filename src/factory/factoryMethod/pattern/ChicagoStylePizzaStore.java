package factory.factoryMethod.pattern;

import factory.factoryMethod.pattern.pizzas.*;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza;
        if(orderType.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        else if(orderType.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        else if(orderType.equals("claim")) {
            pizza = new ChicagoStyleClamPizza();
        }
        else if(orderType.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        }
        else {
            pizza = new SpecialPizza();
        }
        return pizza;
    }
}
