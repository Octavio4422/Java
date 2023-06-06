import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        // for(int i = 0; i <= 10 ; i++){
        //     System.out.println(i);
        // }

        // for(int i = 10; i > 1 ; i--){
        //     System.out.println(i);
        // }

        int num = 0;
        for(int i = 0; i < 4; i++){
            num = leer.nextInt();
            for(int j = 0; j < num; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
