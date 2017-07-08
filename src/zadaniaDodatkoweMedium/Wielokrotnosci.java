package zadaniaDodatkoweMedium;
import java.util.Scanner;
/**
 * Created by dorka on 06.07.2017.
 */
public class Wielokrotnosci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        if(scanner.hasNextDouble()){
            double a = scanner.nextDouble();
            if(scanner.hasNextDouble()) {
                double b = scanner.nextDouble();
                double times;
                if (a > b) {
                    double ilosc = a / b;
                    int i = 1;
                    do {
                        times = b * i;
                        System.out.println(times);
                        i++;
                    } while (a % b == 0 ? i < ilosc : i <= ilosc);


                } else if (b > a) {
                    double ilosc = b / a;
                    int i = 1;
                    do {
                        times = a * i;
                        System.out.println(times);
                        i++;
                    } while (b % a == 0 ? i < ilosc : i <= ilosc);
                } else {
                    System.out.println("Liczby są takie same!");
                }
            } else {
                System.out.print("Niepoprawne dane");
            }
        } else {
            System.out.print("Niepoprawne dane");
        }

    }
}
