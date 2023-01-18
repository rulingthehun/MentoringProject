package eg_2;

abstract class B extends A{
    void firstMethod(){
        System.out.println("FIRST");
        thirdMethod();
    }
    abstract void thirdMethod();
}
