import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] newList = new int[list.length];

        int control = 0;
        for (int i = 0; i < list.length; i++) {
            int a = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == newList[j]) {
                    a++;
                }
            }
            if (a == 0) {
                int count = 0;
                for (int t = 0; t < list.length; t++) {
                    if (list[i] == list[t]) {
                        count++;
                    }
                }
                newList[control] = list[i];
                control++;
                System.out.println(list[i] + " Sayısı " + count + " kere tekrar edildi. ");


            }
        }


    }


}