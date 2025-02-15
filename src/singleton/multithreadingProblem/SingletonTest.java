package singleton.multithreadingProblem;

public class SingletonTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " is running...\n");
        Runnable client1Runnable = new Client1();
        Runnable client2Runnable = new Client2();

        Thread t1 = new Thread(client1Runnable, "Client-1-Thread");
        Thread t2 = new Thread(client2Runnable, "Client-2-Thread");

        t1.start();
        t2.start();
    }
}
