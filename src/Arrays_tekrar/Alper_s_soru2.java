package Arrays_tekrar;

import java.util.Arrays;

public class Alper_s_soru2 {
    public static void main(String[] args) {
        // 0 dan 100 e kadar olan asal sayilari bir arrayin içerine toplayiniz.
        int sayac = 0;
        for (int i = 2; i < 1000; i++) {
            boolean asalMi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMi = false;
                }
            }
            if (asalMi == true) {
                sayac++;
            }
        }
        System.out.println("0 dan yüze kadar kaç tane asal sayı var = " + sayac);
        int[] asalSayilar = new int[sayac];
        int asalSayilarSayaci = 0;
        for (int i = 2; i < 1000; i++) {
            boolean asalMi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMi = false;
                }
            }
            if (asalMi == true) {
                asalSayilar[asalSayilarSayaci] = i;
                asalSayilarSayaci++;
            }
        }
        System.out.println(Arrays.toString(asalSayilar));
    }
}

