package OCA_quastion.Q1;

public class Main {
    private int i = 1;
    public static void main(String argv[]) {
        int i = 2;
        Main s = new Main();
        s.someMethod();
    }
    public static void someMethod(){
//        System.out.println(i);
//        classda ki int i degiskeni static olmadigi icin kod hata verir
//        private static int i olsaydi sorunsuz calisir, cikti 1 olurdu.
    }
}
