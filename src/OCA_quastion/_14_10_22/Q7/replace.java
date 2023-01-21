package OCA_quastion._14_10_22.Q7;

public class replace {
    public static void main(String[] args) {
        String s = "java2s".replace('a', 'Z').trim().concat("Aa");
        s.substring(0, 2);
        System.out.println(s);
    }
//    Answer:
//    B.
//    jZvZ2sAa
}
