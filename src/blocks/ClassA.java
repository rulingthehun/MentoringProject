package blocks;

public class ClassA {
    static {
        System.out.println("ClassA Static Blok Cagrildi...");
    }

    { // Instance Blok
        System.out.println("ClassA Instance Blok Cagrildi...");
    }

    public ClassA(){
        System.out.println("ClassA Constructor Cagrildi...");
    }
}
