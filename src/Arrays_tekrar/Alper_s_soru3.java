package Arrays_tekrar;

import java.util.Arrays;

public class Alper_s_soru3 {
    public static void main(String[] args) {
        // 0 dan 1000 e kadar olan rastgele sayılardan sadece asal olanları bir arrayin içerine toplayiniz.
        int[] birdenBineDizi = new int[1000];
        for (int i = 0; i < birdenBineDizi.length; i++) {
            birdenBineDizi[i] = (int) (Math.random() * 1000);
        }
        int sayac = 0;
        for (int i = 0; i < birdenBineDizi.length; i++) {
            boolean asalMi = true;
            for (int j = 2; j < birdenBineDizi[i]; j++) {
                if (birdenBineDizi[i] % j == 0)
                    asalMi = false;
            }
            if (asalMi == true && birdenBineDizi[i] != 0 && birdenBineDizi[i] != 1)
                sayac++;
        }
        int[] bineKadarAsal = new int[sayac];
        int asalSayaci = 0;
        for (int i = 0; i < birdenBineDizi.length; i++) {
            boolean asalMi = true;
            for (int j = 2; j < birdenBineDizi[i]; j++) {
                if (birdenBineDizi[i] % j == 0)
                    asalMi = false;
            }
            if (asalMi == true && birdenBineDizi[i] != 0 && birdenBineDizi[i] != 1) {
                bineKadarAsal[asalSayaci] = birdenBineDizi[i];
                asalSayaci++;
            }
        }
        Arrays.sort(bineKadarAsal);
        System.out.println(Arrays.toString(bineKadarAsal));
    }
}