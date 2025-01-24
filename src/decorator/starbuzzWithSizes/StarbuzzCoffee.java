package decorator.starbuzzWithSizes;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        String espressoDescription = espresso.getDescription();
        double espressoCost = espresso.cost();
        System.out.println(espressoDescription + ", $" + espressoCost);

        //Prepare Dark Roast with condiments
        //condiments for dark roast- double mocha, whip
        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.SIZE.VENTI);
        Beverage beverageWithMocha1 = new Mocha(beverage2);
        Beverage beverageWithMocha2 = new Mocha(beverageWithMocha1);
        Beverage beverageWithDoubleMochaAndWhip = new Whip(beverageWithMocha2);
        System.out.println(beverageWithDoubleMochaAndWhip.getDescription() + ", $" + beverageWithDoubleMochaAndWhip.cost());

        //Prepare HouseBlend with Soy, Mocha and Whip
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.SIZE.VENTI);
        Beverage beverageWithSoy = new Soy(beverage3);
        Beverage beverageWithSoyMocha = new Mocha(beverageWithSoy);
        Beverage beverageWithSoyMochaWhip = new Whip(beverageWithSoyMocha);
        System.out.println(beverageWithSoyMochaWhip.getDescription() + ", $" + beverageWithSoyMochaWhip.cost());
    }
}
