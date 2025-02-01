package factory.simpleFactory;

public class SimplePizzaFactory {
    public Pizza createPizza(String orderType) {
        Pizza pizza;
        if(orderType.equals("cheese")) {
            pizza = new CheesePizza();
        }
        else if(orderType.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        else if(orderType.equals("claim")) {
            pizza = new ClamPizza();
        }
        else if(orderType.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        else {
            pizza = new SpecialPizza();
        }
        return pizza;
    }
}
