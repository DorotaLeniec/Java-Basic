package zadaniaPodstawowe;
import java.util.Scanner;

/**
 * Created by dorka on 07.07.2017.
 */
public class TablicaInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dlugosc tablicy:");
        if(sc.hasNextInt()){
            int length = sc.nextInt();
            if(length>0){
                System.out.println("Podaj "+ length + " wartosci");
                if(sc.hasNextInt()){
                    int[] intArray = new int[length];
                    for(int a= 0 ; a<length;a++){
                        intArray[a] = sc.nextInt();
                    }
                    for(int i=0;i<length;i++){
                        System.out.print(intArray[i]+ ", ");
                    }
                }else if(sc.hasNextDouble()){
                    double[] doubleArray = new double[length];
                    for(int a= 0 ; a<length;a++){
                        doubleArray[a] = sc.nextDouble();
                    }
                    for(int i=0;i<length;i++){
                        System.out.print(doubleArray[i]+ "' ");
                    }
                } else if(sc.hasNext()){
                    String[] stringArray = new String[length];
                    for(int a= 0 ; a<length;a++){
                        stringArray[a] = sc.next();
                    }
                    for(int i=0;i<length;i++){
                        System.out.print(stringArray[i]+", ");
                    }
                }
            } else {
                System.out.println("Długosc tablicy musi byc dodatnia!!!");
            }
        } else {
            System.out.println("Długość nie może być " + sc.next());
        }
    }
}
