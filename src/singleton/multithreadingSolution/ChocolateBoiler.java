package singleton.multithreadingSolution;

import java.util.concurrent.locks.ReentrantLock;

public class ChocolateBoiler {
    boolean empty;
    boolean boiled;

//    //for double-check locking
//    public volatile static ChocolateBoiler uniqueInstance;

    //for eager loading
    public static ChocolateBoiler uniqueInstance = new ChocolateBoiler();
    private static final ReentrantLock lock = new ReentrantLock();


    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

//   //for lazy locking
//    public static synchronized ChocolateBoiler getInstance() {
//        if(uniqueInstance == null) {
//            uniqueInstance = new ChocolateBoiler();
//        }
//        return uniqueInstance;
//    }

    //for double-check locking
//    public static ChocolateBoiler getInstance() {
//        if (uniqueInstance == null) {
//            synchronized (ChocolateBoiler.class) { //class level lock
//                if(uniqueInstance == null) {
//                    uniqueInstance = new ChocolateBoiler();
//                }
//            }
//        }
//        return uniqueInstance;
//    }

    //for eagerly created instance
    public static ChocolateBoiler getInstance() {
        return uniqueInstance;
    }

    public void fill() {
        System.out.println("[" + Thread.currentThread().getName() + "] is attempting to fill the boiler...");
        if(isEmpty()) {
            if(lock.tryLock()) { //tries to acquire lock without waiting
                try {
                    System.out.println("[" + Thread.currentThread().getName() + "]filling...");
                    empty = false;
                    boiled = false;
                } finally {
                    lock.unlock();
                }
            }
            else {
                System.out.println("[" + Thread.currentThread().getName() + "]could not acquire the lock for filling...");
            }
        }
        else {
            System.out.println("[" + Thread.currentThread().getName() + "]could not fill as it was filled already...");
        }
    }
    public void boil() {
        System.out.println("[" + Thread.currentThread().getName() + "] is attempting to boil the boiler...");
        if(!isEmpty()  && !isBoiled()) {
            if(lock.tryLock()) {
                System.out.println("[" + Thread.currentThread().getName() + "]boiling...");
                boiled = true;
                lock.unlock();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                System.out.println("[" + Thread.currentThread().getName() + "]could not acquire the lock for boiling...");
            }
        }
        else {
            System.out.println("[" + Thread.currentThread().getName() + "]could not fill as it was boiled already...");
        }
    }
    public synchronized void drain() {
        System.out.println("[" + Thread.currentThread().getName() + "] is attempting to drain the boiler...");
        if(!isEmpty() && isBoiled()) {
           if(lock.tryLock()) {
               System.out.println("[" + Thread.currentThread().getName() + "]draining...");
               empty = true;
               boiled = false;
               lock.unlock();
           }
           else {
               System.out.println("[" + Thread.currentThread().getName() + "]could not acquire the lock for draining...");
           }
        }
        else {
            System.out.println("[" + Thread.currentThread().getName() + "]could not fill as it was filled drained...");
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
