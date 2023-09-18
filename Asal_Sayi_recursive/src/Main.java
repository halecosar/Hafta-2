import java.util.Scanner;

public class Main {

    static boolean asal(int number, int i) {
        //en küçük asal sayı 2'dir. Dolayısıyla girilen sayı 2'den küçükse asal değildir.
        if (number < 2) {
            return false;
        }
        // sayaç geriye doğru 1'e kadar geldiyse başka bölen bulamadıysa demekki sayı asal.
        if (i == 1) {
            return true;
        }
        // sayı sınır değerine kalansız bölünüyorsa asal değildir.
        if (number % i == 0) {
            return false;
        }
        //yukrıdakilerin hiçbiri sağlanmadıysa bir kez daha dönsün.
        return asal(number, i - 1);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz:");
        int number = input.nextInt();

        if (asal(number, number - 1) == true) {
            System.out.print(number + " Sayısı asaldır.");
        } else {
            System.out.println(number + " Sayısı asal değildir.");
        }

    }
}