package zadaniaDodatkoweMedium;

/**
 * Created by dorka on 07.07.2017.
 */
public class LiteraWTekscie {
    public static void main(String[] args) {
        String tekst = "To jest testowy tekst";
        String litera = "J";
        tekst = tekst.toLowerCase();
        litera = litera.toLowerCase();
        int counter = 0;
        String[] tekstArray = tekst.split("");
        for(String s : tekstArray){
            if(s.equals(litera)){
                counter++;
            }
        }
        System.out.println("Litera " + litera + " wystepuje " + counter + " razy w tekscie");
    }
}
