public class Main {
    public static void main(String[] args) {

        String[][] letterB = new String[5][3];
        for (int i = 0; i < letterB.length; i++) {
            for (int j = 0; j < letterB[i].length; j++) {
                if (i == 0 || i == 2 || i==4 ) {
                    letterB[i][j] = " * ";
                } else if (j==0 || j==2) {
                    letterB[i][j] = " * ";
                }
                else {
                    letterB[i][j]= "   ";
                }

            }
        }
        for (String[] row : letterB){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}