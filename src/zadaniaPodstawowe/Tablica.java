package zadaniaPodstawowe;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

/**
 * Created by dorka on 07.07.2017.
 */
public class Tablica {
    public static void main(String[] args) {
        int[] array = {1,3,5,10};

        System.out.println("____________Przyklad a_____________");
        System.out.println( Arrays.toString(array));


        System.out.println("_____________Przyklad b ____________");
        for(int a:array){
            System.out.println(a);
        }

        System.out.println("______________Przyklad c ____________");
        for(int i = array.length-1; i >=0 ;i--){
            System.out.println(array[i]);

        }

        System.out.println("______________Przyklad d ____________");
        for(int a:array){
            System.out.println(a);
        }

    }
}
