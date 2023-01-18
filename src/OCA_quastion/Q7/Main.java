package OCA_quastion.Q7;

public class Main {
    public static void main(String args[]) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = "Java";
        do
            System.out.println(s1.equals(s2));
        while (s3 == s4);
    }
//    Answer
//    C. true printed in an infinite loop
}
