package zadaniaDodatkoweHard;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dorka on 11.07.2017.
 */
public class Zadanie3 {
    public static void main(String[] args) {

          int[] numbers = {1,2,3,4,1,1,2,2,2,2,3,6};
          int currentElement;
          int elementCounter=0;
        for(int i=0;i<numbers.length;i++){
            currentElement = numbers[i];
            if(currentElement != 0){
                for(int j=0;j<numbers.length;j++){

                    if(currentElement == numbers[j]){
                        elementCounter++;
                        numbers[j]=0;
                    }
                }
                System.out.println("Liczba " + currentElement + " wystepuje " + elementCounter + " razy w tablicy");
                elementCounter =0;
            }
        }

    }
    static ArrayList arrayToList(int[] arr){
        ArrayList result = new ArrayList();
        for(int i=0;i<arr.length;i++){
            result.add(arr[i]);
        }
        return result;
    }

}
