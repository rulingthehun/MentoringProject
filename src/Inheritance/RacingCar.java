package Inheritance;

public class RacingCar extends Car{

    /*********************  Fields  *********************/
    int maxSpeed;

    /*********************  Constructors  *********************/
    public RacingCar(String model, int year, int maxSpeed) {
        super(model, year);
        this.maxSpeed = maxSpeed;
//        totalCarAmount++;
    }

    /*********************  Methods  *********************/
    @Override
    public void startEngine() {
        System.out.println("Racing car start engine method");
    }
    public static void addNewCar() {
        totalCarAmount++;
    }
    /*********************  Getters and Setters  *********************/
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
