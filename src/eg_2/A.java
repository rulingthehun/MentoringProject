package eg_2;

abstract class A {
    abstract void firstMethod();

    void secondMethod(){
        System.out.println("SECOND");
        firstMethod();
    }
}
