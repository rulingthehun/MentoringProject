package Inheritance;

public class Inheritance_Demo {
    public static void main(String[] args) {
        Car honda = new Car("Honda", 2023);

        SUV peugeot = new SUV("3008", 2021, 4);

        Car ferrari = new RacingCar("Enzo", 2005, 310);

        System.out.println(honda.getModel());
        honda.startEngine();
        System.out.println("\n" + peugeot.getWheelDrive() + "x4 Peugeot " + peugeot.getModel());
        peugeot.startEngine();
        System.out.println("\n" + ferrari.getYear() + " model " + ferrari.getModel() + " Ferrari");
        ferrari.startEngine();

        int x = Car.totalCarAmount;
        System.out.println("\n" + "totalCarAmount = " + x);

//        DRY -> Don't Repeat Yourself
    }
}
