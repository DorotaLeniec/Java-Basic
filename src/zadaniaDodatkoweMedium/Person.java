package zadaniaDodatkoweMedium;

/**
 * Created by dorka on 11.07.2017.
 */
public class Person {
    private String[] names = {"Zosia", "Kasia", "Tomek","Zbyszek","Alan","Kuba","Bogdan","Danka","Dawid"};
    private String[] surNames = {"Bąk","Kokos","Woda","Pogoda","Klasztor","Wawrzyniec","Bibek","Zufel","Habszfer"};
    String name;
    String surName;

    public Person(){
        name = randomName();
        surName = randomSurname();
    }



     String randomName(){
        int random = (int)(Math.random()*names.length);
        String name = names[random];
        return name;
    }
     String randomSurname(){
         int random = (int)(Math.random()*surNames.length);
        String surName = surNames[random];
        return surName;
    }
}
