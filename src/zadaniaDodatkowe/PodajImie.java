package zadaniaDodatkowe;
import java.util.Scanner;

/**
 * Created by RENT on 2017-07-06.
 */
public class PodajImie {
    public static void main(String[] args) {
        Scanner inputy = new Scanner(System.in);
        System.out.println("Podaj Imie ");
        String imie = inputy.nextLine();
        System.out.println("Twoje imie: "+imie);
    }
}
