package factory.factoryMethod.pattern;

import factory.factoryMethod.pattern.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("Aigi : " + pizza1.getName());

        Pizza pizza2 = chicagoStore.orderPizza("veggie");
        System.out.println("Aigi matu ordered a " + pizza2.getName());
    }
}
