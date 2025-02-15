package singleton.multithreadingProblem;

public class Client2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " has started running...");
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}
