package Zadania1;

/**
 * Created by dorka on 10.07.2017.
 */
public class z1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2};
        System.out.println(getSum(1,2,3));
        System.out.println(getAverage(arr));
        System.out.println(getProduct(arr));
        System.out.println(getStrong(10));
        getSumaCiaguAr();
    }

    public static int getSum(int... arr){
        int suma = 0;
        for(int a : arr){
            suma+=a;
        }
        return suma;
    }

    static double getAverage(int[] arr){
       return (double)getSum(arr)/arr.length;
//       return 1.0*getSum(arr)/arr.length;
    }

    static int getProduct(int[] arr){
        int product = 1;
        for(int a : arr){
            product*=a;
        }
        return product;
    }

    static int getStrong(int number){
        int strong = 1;
        for(int i=1; i <= number ; i++){
            strong*=i;
        }
        return strong;
    }

    static void getSumaCiaguAr(){
        int a = 1;
        int r = 2;
        int n = 4;
        int suma = 0;
        for(int i = 0; i <n;i++){
            suma += a + i*r;
        }
        System.out.println(suma);

        int suma2 = ((a + (a+4*r))/r)*n;
        System.out.println(suma2);


    }
}
