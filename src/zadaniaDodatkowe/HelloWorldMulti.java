package zadaniaDodatkowe;
import java.util.Scanner;

/**
 * Created by RENT on 2017-07-06.
 */
public class HelloWorldMulti {

    public static void main(String[] args) {

        Scanner inputy = new Scanner(System.in);
        System.out.println("Ile razy wyświeltic Hello World?; ");
        if(inputy.hasNextInt()){
            int amount = inputy.nextInt();
            for (int i=0; i<amount;i++){
                System.out.println(i+1 + " Hello World");
            }
        } else {
            System.out.println("BUUUU Miałes podac liczbe BUUUU!!!");
        }

    }
}
