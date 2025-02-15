package singleton.multithreadingProblem;

public class ChocolateBoiler {
    boolean empty;
    boolean boiled;
    public static ChocolateBoiler uniqueInstance;
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    public static ChocolateBoiler getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }
    public void fill() {
        if(isEmpty() && !isBoiled()) {
            System.out.println("[" + Thread.currentThread().getName() + "]filling...");
            empty = false;
        }
    }
    public void boil() {
        if(!isEmpty()  && !isBoiled()) {
            System.out.println("[" + Thread.currentThread().getName() + "]boiling...");
            boiled = true;
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            System.out.println("[" + Thread.currentThread().getName() + "]draining...");
            empty = true;
        }
    }
}
