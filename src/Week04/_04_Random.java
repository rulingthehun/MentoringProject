package Week04;

public class _04_Random {
    public static void main(String[] args) {
        int[] sayiDizi = new int[10];
        for (int i = 0; i < sayiDizi.length; i++) {
            sayiDizi[i]=(int) (Math.random()*100);
            if (sayiDizi[i]%2 == 0)
                System.out.println("sayiDizi = " + sayiDizi[i]);
        }
    }
}
