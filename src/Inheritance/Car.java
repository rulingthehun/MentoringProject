package Inheritance;

public class Car {
    /*********************  Fields  *********************/
    private String model;
    private int year;
    public static int totalCarAmount;

    /*********************  Constructors  *********************/
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        addNewCar();
    }

    /*********************  Methods  *********************/
    public void startEngine() {
        System.out.println("Engine started");
    }

    public static void addNewCar() {
        totalCarAmount++;
    }

    /*********************  Getters and Setters  *********************/
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int getTotalCarAmount() {
        return totalCarAmount;
    }

    public static void setTotalCarAmount(int totalCarAmount) {
        Car.totalCarAmount = totalCarAmount;
    }
}
