package Zadania1;

/**
 * Created by dorka on 11.07.2017.
 */
public class z5 {
    public static void main(String[] args) {
        System.out.println("Pole kwadratu o boku 4 : " + squareField(4) + " (16)");
        System.out.println("Pole sześcanu o boku 5 : " + cubeField(5) + " (150)");
        System.out.println("Pole koła o promienu 5 : " + circleField(5)+ " (78,5)");
        System.out.println("Objetość walca o promienu 2, wysokosci 3 : " + rollerVolume(2,3)+ " (37,7)");
        System.out.println("Objetość stożka o promienu 2, dlugosci ramienia 3 : " + coneVolume(2,3)+ " (12,57)");
        System.out.println("Objętość sześcianu o boku 5: " + cubeVolume(5)+ " (125)");
        System.out.println("Objętość ostrosłupa o boku 4 i wysokosci 6: " + piramidVolume(4,6)+ " (32)");
    }

    static int squareField(int a){
        return a*a;
    }
    static int cubeField(int a){
        return squareField(a)*6;
    }

    static double circleField(int r){
        return (Math.PI)*squareField(r);
    }

    static double rollerVolume(int r, int h){
        return circleField(r)*h;
    }

    static double coneVolume(int r, int h){
        return 1.0/3.0 * circleField(r) * h;
    }

    static double cubeVolume(int a){
        return squareField(a)*a;
    }

    static double piramidVolume(int a, int h){
        return 1.0/3.0 *squareField(a)*h;
    }
}
