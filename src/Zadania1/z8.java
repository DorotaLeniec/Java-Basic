package Zadania1;

/**
 * Created by dorka on 11.07.2017.
 */
public class z8 {
    public static void main(String[] args) {
        printDivide(152,16);
        System.out.println();
        printDivide(14.0,3.0);
        printDivide(153,6.0);
        printDivide(2340,151);
    }

    static void printDivide(int a, int b){
        int rest = a%b;
        System.out.print(a/b);
        if(rest !=0) {
            if(b%rest==0) {
                b=b/rest;
                rest=rest/rest;
                System.out.print(" i " + rest + "/" + b);
            } else {
                System.out.print(" i " + rest + "/" + b);
            }
        }
    }

    static void printDivide(double a, double b){
//        double result = (int)((a/b)*1000)*0.001;
        System.out.printf("%.3f",a/b);
        System.out.println();
    }
}
