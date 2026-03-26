package adapter.example1;

/**
 * We want to use Turkey object as a Duck object
 * Meaning client will use Duck interface to call Duck behavior also Turkey behavior
 * But Duck and Turkey both are different interfaces
 * So we need to write an Adapter that adapts a Turkey to a Duck
 * Duck : Target interface
 * Turkey : Adaptee
 */
public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        testDuck(duck);

        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        System.out.println("---------------------------");
        duck.fly();
        duck.quack();
        System.out.println("-----------------------------");
    }
}
