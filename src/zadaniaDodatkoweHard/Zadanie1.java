package zadaniaDodatkoweHard;

/**
 * Created by dorka on 10.07.2017.
 */
public class Zadanie1 {
    public int firstNumber;
    public int secondNumber;

    public Zadanie1(int a, int b){
        firstNumber = a;
        secondNumber = b;
    }
    public void printMultiples(){
        if(firstNumber<secondNumber){
            int multipleAmount = secondNumber/firstNumber;
            for(int i = 1; i <= multipleAmount; i++){
                System.out.println(firstNumber*i);
            }
        }
    }
}
