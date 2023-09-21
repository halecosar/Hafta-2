import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] list= {3,7,3,3,2,9,10,21,1,33,9,1,58,58}; // verilen örnekteki diziye çift sayı eklendi.
        int [] duplicate = new int [list.length];

        int startIndex=0;

        for(int i=0; i<list.length; i++){
            for(int j=0; j<list.length; j++){
                // %2 ile bölünüp bölünmediği sorgulandı.
                if(list[j]%2==0 && i!=j && list[i]== list[j]){
                    if(!isFind(duplicate,list[i])){
                        duplicate[startIndex++]=list[i];
                    }

                }
            }
        }

        for(int i: duplicate){
            if(i!=0){
                System.out.println(i);
            }
        }


    }

    static boolean isFind(int [] array, int value){
        for(int i : array){
            if(i== value){
                return true;
            }

        }
        return false;
    }
}