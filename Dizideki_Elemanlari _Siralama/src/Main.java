import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int l;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin Boyutunu Giriniz : ");
        l = scan.nextInt();
        int [] myArray = new int[l];

        System.out.println("Dizinin elemanlarını giriniz ");


        for (int i=0; i< myArray.length; i++ ){
            System.out.println((i+1) + ". Elemanı");
            n= scan.nextInt();
            myArray[i]=n;

        }
        System.out.println("Oluşturuğunuz Dizi : ");
        System.out.println(Arrays.toString(myArray));

        Arrays.sort(myArray);
        System.out.println("Dizinin Sıralaması : " + Arrays.toString(myArray));




    }
}