import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        String phrase ;

        System.out.println("enter a phrase");
        phrase = read.nextLine();
        System.out.println("Here is you phrase codificated");

        for(int i = 0; i < phrase.length(); i++) {
            System.out.print(iguala(phrase.substring(i, i+1)));
        }
    }

    public static String iguala (String letter) {
         String ol;
        
        switch(letter) {
           case "a": 
            ol = "@";
            break;
           case "e" : 
            ol = "#";
            break;
           case "i" : 
            ol = "$";
            break;
           case "o" : 
            ol = "%";
            break;
           case "u" : 
            ol = "*";
            break;
            default: ol = letter;
        }

        return ol;
    }
}
