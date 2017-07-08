package Loops;

/**
 * Created by RENT on 2017-07-08.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        System.out.println("ZADANIE 1 a");
        for(int i=1;i<=10;i++){
            System.out.print(i);
        }

        System.out.println("ZADANIE 1 b");
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.println("Parzyste " + i);
            } else{
                System.out.println("Nieparzyste "  + i);
            }
        }


        System.out.println("ZADANIE 1 c");
        for(int i=3; i<=100;i++){
            if(i%3==0 || i%5==0){
                System.out.print(i +", ");
            }
        }
        System.out.println(" ");
        System.out.println("ZADANIE 1 c additional XOR");
        for(int i=3; i<=100;i++){
            if((i%3==0) != (i%5==0)){
                System.out.print(i +", ");
            }
        }

        System.out.println("ZADANIE 1 d");
        for(char i = 'a'; i<'z';i++){
            System.out.print(i + " ");
        }
    }
}
