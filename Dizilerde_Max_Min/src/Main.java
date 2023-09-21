import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
// kullanıcıdan değer alındı.
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Bir Sayı Giriniz : ");
        n = scan.nextInt();
//List isimli array elemanları küçükten büyüğe sıralandı.

        Arrays.sort(list);

        int minEnYakin = 0;
        int minEnUzak = 0;

        boolean kucuk = false;
        boolean buyuk = false;

        for (int i : list) {
            if (i < n) {
                minEnYakin = i;
                kucuk = true;
            } else {
                minEnUzak = i;
                buyuk = true;
                break;
            }
        }

        if (kucuk == true) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + minEnYakin);
        } else
            System.out.println("Dizide Girilen Sayıdan Daha Küçük Bir Sayı Yoktur. ");

        if (buyuk == true) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + minEnUzak);
        } else {
            System.out.println("Dizide Girilen Sayıdan Daha Büyük Bir Sayı Yoktur. ");

        }

    }


}
