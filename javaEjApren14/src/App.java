import java.util.Scanner;
// Crea una aplicación que a través de una función nos convierta una cantidad de euros
// introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
// función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
// una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
// (void).
// El cambio de divisas es:
// * 0.86 libras es un 1 €
// * 1.28611 $ es un 1 €
// * 129.852 yenes es un 1 €
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de cambio de euros");

        do {
            System.out.println("Ingrese un monto para realizar el cambio");
            double cant = sc.nextInt();

            System.out.println("A que moneda desea realizar el cambio? dolares, yen o libra?");
            String mon = sc.next();

            Change(cant, mon);

            System.out.println("Desea realizar otra operacion? (S/N)?");
            String cosa = sc.next();
            if (cosa.toUpperCase().equals("N")) break;
            else{
                System.out.println("//////////////////////////////////////////////");
                continue;
            }
        } while(true);

        System.out.println("Hasta la proxima");
    }

    public static void Change(double cantidad, String moneda){
        double cambio[] = {0.86, 1.28611, 129.852 };

        switch(moneda.toUpperCase()) {
            case "DOLAR": 
                System.out.println(cantidad * cambio[1]);
                break;
            case "YEN":
                System.out.println(cantidad * cambio[2]);
                break;
            case "LIBRA":
                System.out.println(cantidad * cambio[0]);
                break;
            default: 
                System.out.println("a pero rompiste todo");
        }
    }
}
