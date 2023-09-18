public class Palindrom {
    static boolean isPalindrom(int input) {

        int temp, kalan, tersSayi = 0;
        temp = input;

        while (temp != 0) {
            kalan = temp % 10;
            tersSayi = (tersSayi * 10) + kalan;
            temp = temp / 10;
        }

        if (input == tersSayi)

            return true;

        else
            return false;
    }



    public static void main(String[] args) {
        System.out.print(isPalindrom(1212));

    }
}