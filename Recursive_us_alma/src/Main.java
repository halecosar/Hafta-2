import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int taban, us;
        System.out.println("---------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısı giriniz: ");
        taban = input.nextInt();

        System.out.print("Üs sayısı giriniz: ");
        us = input.nextInt();
        System.out.println("---------------------------");

        System.out.println("Sonuç: " + power(taban, us));
    }

    static int power(int taban, int us)
    {
        if (us != 0)
        {
            return taban * power(taban, us - 1);
        }
        else
        {
            return 1;
        }
    }
}