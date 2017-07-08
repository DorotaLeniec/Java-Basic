package zadaniaDodatkowe;
import java.util.Scanner;

/**
 * Created by RENT on 2017-07-06.
 */
public class WynikDzieleniaDouble {

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Podaj dwie liczby zmiennoprzecinkowe");
        double a = inputs.nextDouble();
        double b = inputs.nextDouble();
        double wynik = a/b;
        System.out.println("Wynik dzielenia : "+ wynik);

    }
}
