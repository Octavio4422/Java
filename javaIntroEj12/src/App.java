import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingrese un numero");
        num1 = read.nextInt();

        System.out.println("Ingrese otro numero");
        num2 = read.nextInt();

        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo (int num1, int num2) {
        if(num2 % num1 == 0) {
            System.out.println("Si es multiplo");
        } else {
            System.out.println("No es");
        }
    }
}
