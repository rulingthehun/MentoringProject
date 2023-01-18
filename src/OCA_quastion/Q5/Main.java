package OCA_quastion.Q5;

public class Main {
    public int i;
    public static void main(String argv[]) {
        Main sc = new Main();
//        A.
//        System.out.println(i);

//        B. Dogru
        System.out.println(sc.i);

//        C.
//        System.out.println(Main.i);

//        D. Dogru
        System.out.println((new Main()).i);

    }
}
