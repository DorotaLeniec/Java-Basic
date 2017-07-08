package zadaniaPodstawowe;

public class Alfabet {
    public static void main(String[] args) {
        char a = 'a';
        for(int i=65;i<=90;i++){
            System.out.println((char)i);
            System.out.println(a);
            a++;
        }
        System.out.println("____________________________________");
        for(char c='a';c<='z';c++){
            System.out.println(c);
        }
    }
}
