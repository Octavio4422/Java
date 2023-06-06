import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un tamaño para su cuadrado");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num ; j++){
                if(i == 0 || i == num-1){
                    System.out.print(" * ");
                } else if(j == 0 || j == num-1){
                    System.out.print(" * ");
                } 
                else System.out.print("   ");
            }
            System.out.println("");
        }
    }
}
