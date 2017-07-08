package zadaniaPodstawowe;

/**
 * Created by RENT on 2017-07-08.
 */
public class Array4x4 {
    public static void main(String[] args) {

        int counter = 1;
        int[][] twoDimensionArray = new int[4][4];

        for (int i = 0; i < twoDimensionArray.length; i++) {
            for (int j = 0; j < twoDimensionArray[i].length; j++) {
                twoDimensionArray[i][j] = counter;
                counter++;
            }
        }

        for(int i=0;i<twoDimensionArray.length;i++){
            System.out.print("Rząd " + (i+1) + ": ");
            for(int j=0;j<twoDimensionArray[i].length;j++){
                System.out.print(twoDimensionArray[i][j] + " ");
            }
        }
    }
}
