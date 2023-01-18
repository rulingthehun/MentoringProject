package Arrays_tekrar;

import java.util.Arrays;

public class Alper_s_tekrar {


    public static void main(String[] args) {


        System.out.println("-------------------------------- Arrays.toString() fonksiyonu -----------------------------------");

        int[] dizi = {1, 2, 3, 4};

        /*
            Arrays.toString(x) fonksiyonu x için bir array parametresi alır. Arrayin içerisindeki her bir elemani liste olarak döndürür.
         */

        String a = Arrays.toString(dizi);

        a = a + ", Merhaba Java";

        System.out.println(a);
        System.out.println(Arrays.toString(dizi));

        System.out.println("-------------------------------- Arrays.sort() fonksiyonu -----------------------------------");

        // Arrays.sort(x) x için bir array parametresi alır. Array içerisindeki her bir elemanı ascii tablosundaki siraya göre
        // siralar. Bu sira oncelik olarak: özel karakterler --> sayilar --> Büyük harfler --> küçük harfler

        Object[] ascii = {"a", "b", "c", "A", "C", "+", "2"};

        Arrays.sort(ascii);

        System.out.println(Arrays.toString(ascii));

        String[] stringArray = {"a", "e", "z", "h", "b"};
        int[] integerArray = {3, 7, 1, 2, 13, 35};

        Arrays.sort(stringArray);
        Arrays.sort(integerArray);

        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(integerArray));

        System.out.println("-------------------------------- Arrays.equals() fonksiyonu -----------------------------------");

        // Arrays.equals(x,y) fonksiyonu x ve y olarak bizde 2 array alir. Eğer ki arrayler birbirinle ayni değerleri tutuyor ise true, tutmuyor ise
        // false değerini döndürür.

        Object[] x = {"abc", 3, "ghi"};
        Object[] y = {"abc", 3, "ghi"};
        Object[] z = {"abc", 3, "klm"};

        System.out.println(Arrays.equals(x, y));
        System.out.println(Arrays.equals(x, z));

        System.out.println("-------------------------------- Arrays.fill() fonksiyonu -----------------------------------");

        // Arrays.fill(x,y) fonksiyonu x ve y olarak 2 parametre alır. "x" için bir array nesnesi, "y" için "x" arrayin tipine göre değer alır.
        // "x" arrayininin her bir elemanını "y" değeri ile doldurur.

        char[] charArray = {'a', 'b', 'c', 'd', 'e'};

        System.out.println(Arrays.toString(charArray));

        Arrays.fill(charArray, 'z');

        System.out.println(Arrays.toString(charArray));

        System.out.println("-------------------------------- Arrays.binarySearch() fonksiyonu -----------------------------------");

        // Arrays.binarySearch(x,y) fonksiyonu bizden "x" ve "y" 2 parametre alır. "x" için array, "y" için ise "x" arrayinin türüne göre bir değer alir.
        // "x" arrayinin içerisinde "y" değerini arar ve bize indexini döndürür. Fakat fonksiyonun düzgün çalışması için "x" arrayinin sıralı olması gerekir.

        int[] strings = {4, 1, 2, 6, 3};

        Arrays.sort(strings);

        int index = Arrays.binarySearch(strings, 1);

        System.out.println(index);


        System.out.println("-------------------------------- .split() -----------------------------------");

        // .split(x) fonksiyonu, string değişkenleri üzerinde kullanabilinir. "x" değeri için stringte geçen her bir elemanı bölerek
        // bir String arrayine atmamıza yardımcı olur.

        String cumle = "merhaba java bach 2 ile tekrar dersi";

        String[] kelimeler = cumle.split(" ");

        System.out.println(Arrays.toString(kelimeler));


    }
}