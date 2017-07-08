package zadaniaPodstawowe;

/**
 * Created by RENT on 2017-07-08.
 */
public class MultiLevelArray {

    public static void main(String[] args) {
        int[][] intArr = new int[3][4];
        for(int i=0;i<intArr.length;i++){
            for(int j=0;j<intArr[i].length;j++){
                intArr[i][j]=1;
            }
        }

        for(int i = 0;i<intArr.length;i++){
            System.out.print("Rząd " + (i+1)+ ":");
            for(int j=0;j<intArr[i].length;j++){
                System.out.print(" " + intArr[i][j]+ " ");
            }
            System.out.println("");
        }

    }
}
