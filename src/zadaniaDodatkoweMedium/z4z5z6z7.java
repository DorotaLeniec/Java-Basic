package zadaniaDodatkoweMedium;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by dorka on 11.07.2017.
 */
public class z4z5z6z7 {
    public static void main(String[] args) {

     int[] origin = {1,2,3,4,5};
     int[] copy = new int[origin.length];
     int[] copy2 = origin.clone();
     for(int i=0;i<origin.length;i++){
         copy[i]=origin[i];
     }
        System.out.println("Oryginalny element 1 - " + origin[0]);
        System.out.println("Skopiowany element 1 - " + copy[0]);
        System.out.println("Skopiowany2 element 1 - " + copy2[0]);
        copy[0] = 333;
        copy2[0] = 44444;
        System.out.println("Oryginalny element 1 - " + origin[0]);
        System.out.println("Skopiowany element 1 - " + copy[0]);
        System.out.println("Skopiowany2 element 1 - " + copy2[0]);

        int[] orgynal = {1,22,33,44};
        int[] coppy = makeCopy(orgynal);
        System.out.println(Arrays.toString(coppy));
        coppy[2]=11111;
        System.out.println(Arrays.toString(coppy));
        System.out.println(Arrays.toString(orgynal));

        ArrayList arrayList = new ArrayList();
        System.out.println("dlugosc arraylist " + arrayList.size());
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add("ff");
        System.out.println("dlugosc arraylist " + arrayList.size());
        System.out.println("Zawartosc arrayLIst "+ arrayList);
        System.out.println("Zawartosc arrayLIst "+ arrayList);

        String[] names = {"kasia", "basia","asia"};
        ArrayList numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        arrayToList(names);
        listToArray(numbers);
        square(1,2,3,4,5,6);


    }

    static int[] makeCopy(int[] arr){
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=arr[i];
        }
        return result;
    }

    static void arrayToList(Object[] arr){
        ArrayList result = new ArrayList();
        for(int i=0;i<arr.length;i++){
            result.add(arr[i]);
        }
        System.out.println("ARRAY LIST :" + result);
    }

    static void listToArray(ArrayList al){
        Object[] array = new Object[al.size()];
        for(int i=0;i<al.size();i++){
            array[i]=al.get(i);
        }
        System.out.println("ARRAY FROM LISTARRAY: " + Arrays.toString(array));
    }

    static void square(int... arr){
        for(int i=0;i<arr.length;i++){
            arr[i]*=arr[i];
        }
        System.out.println("Square " + Arrays.toString(arr));
    }
}
