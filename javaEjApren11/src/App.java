import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido papa, aca tenes una especie de calculadora rapida");
        Menu();
    }

    public static void Menu() {
        Scanner read = new Scanner(System.in);
        boolean keep = true;

        System.out.println("Este es el menu");

        System.out.println("Ingrese el primer numero:");
        int num1 = read.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = read.nextInt();

        System.out.println("//////////////////////////////////////////");
        do {
            System.out.println("Que operacion desea hacer con los numeros?");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir de la calculadora");
            int option = read.nextInt();
            ValidateNum(option);

            if (option == 5) {
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String cosa = read.next();
                if (cosa.toUpperCase().equals("S")) break;
                else continue;
            } else {
                Operation(option, num1, num2);
            }
        } while (keep);

        System.out.println("Nos vemos");
    }

    public static void Operation(int option, int num1, int num2) {
        switch (option) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Como llegaste aca?");
        }
    }

    // Esto valida el numero de operacion
    public static int ValidateNum(int num) {
        Scanner read = new Scanner(System.in);
        int number = num;

        while (number < 1 || number > 6) {
            System.out.println("Igrese un numero valido");
            number = read.nextInt();
        }
        return number;
    }
}
