package factory.abstractFactory;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyStore.orderPizza("veggie");
        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println();
        System.out.println("aigi: " + pizza1);
        System.out.println("aigi matu gi: " + pizza2);
    }
}
