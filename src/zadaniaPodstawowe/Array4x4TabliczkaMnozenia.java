package zadaniaPodstawowe;

/**
 * Created by RENT on 2017-07-08.
 */
public class Array4x4TabliczkaMnozenia {
    public static void main(String[] args) {

        int[][] twoDimensionArray = generateArray();
        printArray(twoDimensionArray);
    }

    private static void printArray(int[][] twoDimensionArray) {
        System.out.println("******Tabliczka mnożenia 4x4*****");
        System.out.println("*|1|2|3|4|");
        System.out.println("__________");
        for(int i=0;i<twoDimensionArray.length;i++){
            System.out.print((i+1) + "|");
            for(int j=0;j<twoDimensionArray[i].length;j++){
                System.out.print(twoDimensionArray[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static int[][] generateArray() {
        int[][] twoDimensionArray = new int[4][4];

        for (int i = 0; i < twoDimensionArray.length; i++) {
            for (int j = 0; j < twoDimensionArray[i].length; j++) {
                twoDimensionArray[i][j] = (i+1)*(j+1);
            }
        }
        return twoDimensionArray;
    }
}
