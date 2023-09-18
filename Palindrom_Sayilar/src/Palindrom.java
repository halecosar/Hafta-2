public class Palindrom {
    static boolean isPalindrom(int input) { //metot belirlendi.


        //değişkenler belirlendi.
        int temp, kalan, tersSayi = 0;
        temp = input;

        while (temp != 0) {
            kalan = temp % 10;
            tersSayi = (tersSayi * 10) + kalan;
            temp = temp / 10;
        }
        //girlen sayı tersine eşitse true,değilse false gelsin.
        if (input == tersSayi)

            return true;

        else
            return false;
    }


    public static void main(String[] args) {
        System.out.print(isPalindrom(1212));

    }
}