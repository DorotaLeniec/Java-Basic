package shapes;

/**
 * Created by dorka on 10.07.2017.
 */
public class Shapes {

    public static void main(String[] args) {
//        printRec(2,4);
        printTri(3);
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
        System.out.println();
    }

    public static void printTri(int height){
        for(int i=1;i<=height;i++){
            printLien(i);
        }
    }
}
