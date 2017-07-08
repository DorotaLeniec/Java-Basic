package zadaniaPodstawowe;

import org.jetbrains.annotations.Contract;

/**
 * Created by RENT on 2017-07-08.
 */
public class CompareArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        if(areTheSameArrays(arr1,arr2)){
            System.out.println("Tablice są takie same!!!");
        } else {
            System.out.println("Tablice sie różnia");
        }

    }

    @Contract(pure = true)
    private static boolean areTheSameArrays(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            int counter = 0;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    counter++;
                }
            }
            if (counter == arr1.length) {
                return true;
            }
        }
        return false;
    }
}