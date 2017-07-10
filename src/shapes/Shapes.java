package shapes;

/**
 * Created by dorka on 10.07.2017.
 */
public class Shapes {

    public static void main(String[] args) {
//        printRec(2,4);
        printTri(5);
    }
    public static void printRec(int a, int b){
        for(int i = 0;i<a;i++){
            printLien(b);
        }
    }


    private static void printLien(int b) {
        for(int j = 0;j<b;j++){
            System.out.print("*");
        }
    }

    public static void printTri(int height){
        for(int i=1;i<=height;i++){
            printSpaces((height-i)/2);
            printLien(i);
            printSpaces((height-i)/2);
            System.out.println();
        }
    }

    public static void printSpaces(int length){
        for(int j=0;j<length;j++){
            System.out.print(" ");
        }
    }
}
