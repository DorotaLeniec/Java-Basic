package Zadania1;

/**
 * Created by dorka on 10.07.2017.
 */
public class z1g {
    public static void main(String[] args) {


        String[] words = {"Kasia","Karolina","Kuba","Tomasz","Zbigniew"};
        System.out.println(getSum(getLetterAmount(words)));
        System.out.println(1.0*getSum(getLetterAmount(words))/words.length);

    }
    static int[] getLetterAmount(String[] arr){
        int[] result = new int[arr.length];
        for(int i = 0; i< arr.length ; i++){
            result[i] = arr[i].length();
        }
        return result;
    }

    public static int getSum(int[] arr){
        int suma = 0;
        for(int a : arr){
            suma+=a;
        }
        return suma;
    }
}
