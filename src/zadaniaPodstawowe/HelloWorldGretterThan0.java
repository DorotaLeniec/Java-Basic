package zadaniaPodstawowe;
import java.util.Scanner;

/**
 * Created by dorka on 07.07.2017.
 */
public class HelloWorldGretterThan0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę :");
        int liczba;
        do {
            if(sc.hasNextInt()) {
                liczba = sc.nextInt();
                if (liczba > 0) {
                    System.out.println("Hello World");
                }
            } else {
                System.out.println("To nie jest liczba");
                liczba = 0;
            }
        }while(liczba > 0);
        System.out.println("Koniec zabawy");
    }
}
