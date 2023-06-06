import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        int correct = 0;
        int rong = 0;

        do {
            System.out.println("Ingrese una cadena RS232, no mas de 5 caracteres de largo, para finalizar ingrese &&&&&");
            String input = read.nextLine();

            if(input.equals("&&&&&")) break;

            if (input.length() < 5 || input.length() >5) {
                rong += 1;
                continue;
            } else if (!input.substring(0,1).toUpperCase().equals("X") ) {
                rong += 1;
                continue;
            } else if (!input.substring(input.length() - 1,input.length()).toUpperCase().equals("O")) {
                rong += 1;
                continue;
            } else {
                correct += 1;
                continue;
            }
        }while(true);

        System.out.println("salimos");
        System.out.println("cantidad de correctas " + correct);
        System.out.println("cantidad de incorrectas " + rong);
    }
}
