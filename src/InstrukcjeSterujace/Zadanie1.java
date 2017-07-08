package InstrukcjeSterujace;
import java.util.Scanner;

/**
 * Created by RENT on 2017-07-06.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        Scanner inputy = new Scanner(System.in);
        System.out.println("Podaj liczbe : ");
        int liczba = inputy.nextInt();

        if(liczba%3 == 0 && liczba%5 ==0){
            System.out.println("HURA " + liczba + " Jest podzielna przez 3 i 5 :)");
        } else if(liczba%5 == 0){
            System.out.println("JUHU " + liczba + " Jest podzielna przez 5");
        } else if(liczba%3 == 0){
            System.out.println("JUHU " + liczba + " Jest podzielna przez 3");
        } else {
            System.out.println("BUUU Twoja liczba nie jest podzielna przez 3 ani przez 5 :(");
        }
    }
}
