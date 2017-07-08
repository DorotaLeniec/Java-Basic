package zadaniaDodatkowe;
import java.util.Scanner;

/**
 * Created by RENT on 2017-07-06.
 */
public class DrukowanieLiczby {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        int liczba = inputValue.nextInt();
        System.out.println("Twoja liczba to " + liczba);
    }
}
