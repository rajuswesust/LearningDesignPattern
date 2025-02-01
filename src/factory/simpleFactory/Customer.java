package factory.simpleFactory;

public class Customer {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        Pizza oder1 = pizzaStore.orderPizza("veggie");

        Pizza order2 = pizzaStore.orderPizza("pepperoni");
        Pizza order3 = pizzaStore.orderPizza("Namai Mathu");
    }
}
