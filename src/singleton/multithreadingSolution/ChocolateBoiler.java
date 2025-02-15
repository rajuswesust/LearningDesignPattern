package singleton.multithreadingSolution;

public class ChocolateBoiler {
    boolean empty;
    boolean boiled;
    public static ChocolateBoiler uniqueInstance = new ChocolateBoiler();
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
//    public static synchronized ChocolateBoiler getInstance() {
//        if(uniqueInstance == null) {
//            uniqueInstance = new ChocolateBoiler();
//        }
//        return uniqueInstance;
//    }

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

    public static ChocolateBoiler getInstance() {
        return uniqueInstance;
    }

    public void fill() {
        System.out.println("[" + Thread.currentThread().getName() + "] is attempting to fill the boiler...");
        if(isEmpty()) {
            synchronized (this) {   //object-level lock (here it works same as class level lock because we have only one singleton instance)
                if (isEmpty()) {
                    System.out.println("[" + Thread.currentThread().getName() + "]filling...");
                    empty = false;
                    boiled = false;
                }
                else {
                    System.out.println("[" + Thread.currentThread().getName() + "]have to wait for filling...");
                }
            }
        }
    }
    public void boil() {
        System.out.println("[" + Thread.currentThread().getName() + "] is attempting to boil the boiler...");
        if(!isEmpty()  && !isBoiled()) {
            System.out.println("[" + Thread.currentThread().getName() + "]boiling...");
            boiled = true;
        }
        else {
            System.out.println("[" + Thread.currentThread().getName() + "]have to wait for boiling...");
        }
    }
    public void drain() {
        System.out.println("[" + Thread.currentThread().getName() + "] is attempting to drain the boiler...");
        if(!isEmpty() && isBoiled()) {
            System.out.println("[" + Thread.currentThread().getName() + "]draining...");
            empty = true;
            boiled = false;
        }
        else {
            System.out.println("[" + Thread.currentThread().getName() + "]have to wait for drain...");
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
