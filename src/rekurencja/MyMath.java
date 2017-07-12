package rekurencja;

/**
 * Created by dorka on 12.07.2017.
 */
public class MyMath {
    public static void main(String[] args) {
        System.out.println(pow(2,-3));

    }
    static double pow(double a, int b){
        if(b>=0){
            double result = 1;
            for(int i=0;i<b;i++){
                result*=a;
            }
            return result;
        } else {
            return 1/pow(a,-b);
        }
    }
}
