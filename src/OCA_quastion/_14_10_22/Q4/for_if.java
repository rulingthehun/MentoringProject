package OCA_quastion._14_10_22.Q4;

public class for_if {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1; i < 4; i++) {
            for (j = 2; j < 4; j++) {
                if (j == 3)
                    continue;
                System.out.println("i:" + i + " j:" + j);
            }
        }
    }
//    Answer:
//    a.
//    i:1 j:2
//    i:2 j:2
//    i:3 j:2
}
