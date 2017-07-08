package zadaniaDodatkowe;
import java.util.Scanner;

/**
 * Created by RENT on 2017-07-06.
 */
public class Suma3Liczb {
    public static void main(String[] args) {
        Scanner inputy = new Scanner(System.in);
        System.out.println("Podaj Imie ");
        int a = inputy.nextInt();
        int b = inputy.nextInt();
        int c = inputy.nextInt();
        int suma = a+b+c;
        System.out.println("Suma trzech liczb: " + suma);
    }
}
