package abstractClass;

public abstract class Shape {
    String color;

    public Shape(String color) {
        System.out.println("*** Shape constructor called ***");
        this.color = color;
    }

    abstract double area();

    public abstract String toString();

    public String getColor() {
        return color;
    }
}
