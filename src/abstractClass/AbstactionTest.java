package abstractClass;

public class AbstactionTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3, 4,
                "Yellow");
        System.out.println(rectangle + "\n");

        Shape s2 = new Circle(5, "Blue");
        System.out.println(s2);
    }
}
