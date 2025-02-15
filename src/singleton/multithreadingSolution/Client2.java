package singleton.multithreadingSolution;

public class Client2 implements Runnable {

    @Override
    public void run() {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        System.out.println(Thread.currentThread().getName() + " has started running: " + boiler);
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}
