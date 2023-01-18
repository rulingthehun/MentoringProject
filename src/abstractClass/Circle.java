package abstractClass;

public class Circle extends Shape{

    private int radius;

    public Circle(int radius, String color) {
        super(color);
        System.out.println("Inside Circle Constructor");
        this.radius = radius;
    }


    @Override
    double area() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle color is " + super.getColor() +
                " and circle area is " + Math.round(area());
    }
}
