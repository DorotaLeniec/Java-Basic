package zadaniaDodatkowe;
import java.util.Scanner;
/**
 * Created by RENT on 2017-07-06.
 */
public class ResztaZDzielenia {
    public static void main(String[] args) {
        Scanner inputy = new Scanner(System.in);
        System.out.println("Podaj liczbe :");
        int a = inputy.nextInt();
        System.out.println("Podaj dzielnik:");
        int b = inputy.nextInt();
        int reszta = a%b;
        System.out.println("Reszta z dzielenia liczby: " + a + " przez " + b + " to: " + reszta);
    }
}
