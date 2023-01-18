package Week04;

import java.util.Arrays;

public class _02_Array {
    public static void main(String[] args) {
        int[] rakamlar = new int[10];
        for (int i = 0; i < rakamlar.length; i++) {
            rakamlar[i] = 2 * i;
        }
        System.out.println("Arrays.toString(rakamlar) = " + Arrays.toString(rakamlar));
    }
}