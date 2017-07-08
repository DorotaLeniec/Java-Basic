package InstrukcjeSterujace;
import java.util.Scanner;
/**
 * Created by RENT on 2017-07-06.
 */
public class SwitchFun {

    public static void main(String[] args) {
        Scanner inputy = new Scanner(System.in);
        System.out.println("Podaj dwie liczby : ");
        int a = inputy.nextInt();
        int b = inputy.nextInt();
        System.out.println("Podaj operator działania na liczbach (+,-,*,/)");
        String c = inputy.next();
        switch(c){
            case "/":
             double wynikDzielenia = a/b;
             System.out.println("Wynik Twojego dzialania to: " + wynikDzielenia);
             break;
            case "*":
                int wynikMnozenia = a*b;
                System.out.println("Wynik Twojego dzialania to: " + wynikMnozenia);
                break;
            case "+":
                int wynikDodawania = a+b;
                System.out.println("Wynik Twojego dzialania to: " + wynikDodawania);
                break;
            case "-":
                int wynikOdejmowania = a-b;
                System.out.println("Wynik Twojego dzialania to: " + wynikOdejmowania);
                break;
            default:
                System.out.println("Error zly operator dzialania :(");
                break;
        }
    }
}
