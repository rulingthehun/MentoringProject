package blocks;

public class ClassB extends ClassA{
    static {
        System.out.println("ClassB Static Blok Cagrildi...");
    }

    { // Instance Blok
        System.out.println("ClassB Instance Blok Cagrildi...");
    }

    public ClassB(){
        System.out.println("ClassB Constructor Cagrildi...");
    }
}
