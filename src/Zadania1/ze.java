package Zadania1;

/**
 * Created by dorka on 11.07.2017.
 */
public class ze {
    public static void main(String[] args) {
//        System.out.println(getGretterNumber(3,10.0));
//        System.out.println(getGretterNumber(1500,20,500));
        System.out.println(minArray(1,2,3,4,5,6,7,8,1));
        System.out.println(minArray());
        System.out.println(minArray(1111,2,30,4,59,6,7,8,100));
        System.out.println(minArray(1111,2,30,4,595555,6888,0,700000000,8,1009999999));
//        System.out.println(max());
    int[] numbers = {1,3,4,5,6,7,9,1,1,1};
        System.out.println("Pozycja w tablicy liczby 7 wynosi : " + findIndex(7,numbers));
        System.out.println("Pozycja w tablicy liczby 10 wynosi : " + findIndex(10,numbers));
        System.out.println("Pozycja w tablicy liczby 1 wynosi : " + findIndex(1,numbers));
    }

    static double min(double a, double b){
      return a<b? a:b;
    }

    static double min(double a, double b, double c){
        return min(min(a,b),c);
    }

    static double minArray(int... arr){
        if(arr.length == 0 ){
            throw new IllegalArgumentException("Array is empty");
        }
            double result = arr[0];
            for (int i = 0; i < arr.length; i++) {
              result =  min(result,arr[i]);
            }
            return result;
    }

    static int findIndex(int a, int[] arr){

        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a) {
                return i;
            }
        }
        return index;
    }
}
