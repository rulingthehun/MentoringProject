package Inheritance;
public class SUV extends Car{

    /*********************  Fields  *********************/
    private int wheelDrive;

    /*********************  Constructors  *********************/
    public SUV(String model, int year, int wheelDrive) {
        super(model, year);
        this.wheelDrive = wheelDrive;
//        addNewCar();
    }

    /*********************  Methods  *********************/
    public void startEngine() {
        System.out.println("SUV start engine method");
    }
    /*********************  Getters and Setters  *********************/
    public int getWheelDrive() {
        return wheelDrive;
    }

    public void setWheelDrive(int wheelDrive) {
        this.wheelDrive = wheelDrive;
    }
}
