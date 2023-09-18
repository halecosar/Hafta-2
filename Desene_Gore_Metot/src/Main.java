import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //dışarıdan değer alındı.
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = scan.nextInt();
        //girilen sayıyı kaybetmemek için iki n değeri gönderildi bir tanesi temp olarak tutuldu.
        desenAzalan(n, n);
    }

    static void desenAzalan(int n, int tempN) {
        if (n > -5) {
            System.out.println((n));
            n = n - 5;
            desenAzalan(n, tempN);
        } else {
            desenArtan(n+5, tempN);
        }
    }

    static void desenArtan(int n, int tempN) {
        if (n != tempN) {
            System.out.println((n+5));
            n = n + 5;
            desenArtan(n, tempN);
        }
    }


}