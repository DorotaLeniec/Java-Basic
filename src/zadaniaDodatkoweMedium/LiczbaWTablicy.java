package zadaniaDodatkoweMedium;

/**
 * Created by dorka on 06.07.2017.
 */
public class LiczbaWTablicy {

    public static void main(String[] args) {
        int[] tablica = {1,1,2,2,2,3,3,3,3,4,4,4,4,4};
        int liczba = 4;
        int counter = 0;

       for(int i : tablica){
           if(i == liczba){
               counter++;
           }
       }

        System.out.println("Liczba " + liczba + " wystepuje " + counter + " razy");



    }


}
