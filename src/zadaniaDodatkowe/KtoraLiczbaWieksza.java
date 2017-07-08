package zadaniaDodatkowe;
import java.util.Scanner;

/**
 * Created by RENT on 2017-07-06.
 */
public class KtoraLiczbaWieksza {
    public static void main(String[] args) {

        Scanner inputValues = new Scanner(System.in);
        System.out.println("Podaj dwie liczby :");
        int numberOne = inputValues.nextInt();
        int numberTwo = inputValues.nextInt();
        if(numberOne > numberTwo){
            System.out.println(numberOne);
        } else if ( numberTwo > numberOne){
            System.out.println(numberTwo);
        } else {
            System.out.println("Liczby są takie same");
        }
    }
}
