package Arrays_tekrar;

import java.util.Arrays;

public class Alper_s_soru1 {

    public static void main(String[] args) {


        /*

            Rastgele sayılardan oluşan 50 elemanlık bir diziyi sırası ile tersten farkli bir dizinin içerisine atiniz.

            [1,7,3,9,6] ---> [9,7,6,3,1]

         */

        int[] duzDizi = new int[50];

        for (int i = 0; i < duzDizi.length; i++) {

            duzDizi[i] = (int) (Math.random() * 100);

        }

        Arrays.sort(duzDizi);

        int[] tersDizi = new int[duzDizi.length];

        int sayac = 0;

        for (int i = duzDizi.length - 1; i >= 0; i--) {

            tersDizi[sayac] = duzDizi[i];

            sayac++;
        }

        System.out.println(Arrays.toString(duzDizi));
        System.out.println(Arrays.toString(tersDizi));

    }

}
