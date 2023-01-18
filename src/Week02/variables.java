package Week02;

public class variables {
    public static void main(String[] args) {

        //Declare and initialize numeric files: price, tax, quantity and total
        //do not initialize total
        double price=29.99;
        int quantity=2;
        double tax=1.04;
        double total;
        total=quantity+price+tax;
        System.out.println("total cost with tax = " + total);

    }
}
