package zadaniaPodstawowe;

/**
 * Created by RENT on 2017-07-08.
 */
public class NameArray {

    public static void main(String[] args) {
        String[] nameArray = {"Tomek","Asia","Kasia","Basia","Ela","Zuza","Monika","Ala"};
        System.out.println("_______Zadanie 3 a");
        for(String a:nameArray){
            System.out.println(a);
        }

        System.out.println("_______Zadanie 3 b");
        for(int i=0; i<nameArray.length;i++){
            if(i%2==0){
                System.out.println(nameArray[i]);
            }
        }

        System.out.println("Zadanie 3 c");
        for(int i=0;i<nameArray.length;i++){
            if(nameArray[i].startsWith("A")){
                System.out.println(nameArray[i]);
            }
        }

    }
}
