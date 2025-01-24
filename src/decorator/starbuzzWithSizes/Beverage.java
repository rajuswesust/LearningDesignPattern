package decorator.starbuzzWithSizes;

public abstract class Beverage {
    public enum SIZE {
        TALL,
        GRANDE,
        VENTI
    };
    SIZE size = SIZE.TALL;
    String description = "UNKNOWN BEVERAGE";
    public String getDescription() {
        return description;
    }
    public abstract double cost();

    public SIZE getSize() {
        return size;
    }

    public void setSize(SIZE size) {
        this.size = size;
    }
}
