import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int i, j;
        int rowNumber, columnNumber;
        int n;
// Kullanıcıdan dizimizin boyutunu aldık (Satır ve sütun olarak.)

        System.out.println("Oluşturulacak Row  sayısını giriniz :");
        rowNumber = scan.nextInt();
        System.out.println("Oluşturulacak  Column sayısını giriniz :");
        columnNumber = scan.nextInt();
        // matris oluşturuldu ve matris elemanları kullanıcıdan alındı.
        int[][] matris = new int[rowNumber][columnNumber];
        System.out.println("Matrisin Elemanlarını Giriniz");

        //kullanıcıdan alma işlemi yapıldı. Çok boyutlu dizi olduğu için for içinde for kullandık.
        for (i = 0; i < matris.length; i++) {
            for (j = 0; j < matris[i].length; j++) {
                System.out.println((i + 1) + "." + (j + 1) + "." + "Elemanı Giriniz : ");
                n = scan.nextInt();
                matris[i][j] = n;
            }
        }
        // Alınan verilere göre oluşturulan matris ekrana yazdırıldı.
        for (int[] a : matris) {
            for (int b : a) {
                System.out.print(b);
            }
            System.out.println();
        }
        // bir satır boşluk bırakıldı.
        System.out.println();

        //Transpoz isimli yeni bir dizi oluşturuldu. Matris satır ve sütülarının tersi oluşturuldu.
        int[][] transpoz = new int[columnNumber][rowNumber];

        // Transpoz elemanlarını belirledik. Bu değerler ile yeni matris oluşturuldu.
        for (i = 0; i < matris.length; i++) {
            for (j = 0; j < matris[i].length; j++) {
                if (i == j) {
                    transpoz[i][j] = matris[i][j];
                } else {
                    transpoz[j][i] = matris[i][j];
                }
            }
        }
        // yeni matris ekrana yazdırıldı. (Transpoz)
        for (int[] a : transpoz) {
            for (int b : a) {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}