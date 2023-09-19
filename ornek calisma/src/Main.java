
import java.util.Scanner;

public class Main {
// kullanıcıdan bir sayı al bu sayıyı metoda gönder bu metodda recursive ile girdiğin sayı 0 olana kadar ekrana tales yazsın

    static void Tales(int n) {

    if (n>0){
        System.out.print("Tales");
        n--;
        Tales(n);
    }

    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz : ");
        n = scan.nextInt();
        Tales(n);


    }
}