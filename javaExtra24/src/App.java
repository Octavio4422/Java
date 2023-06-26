import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número n:");
        int n = sc.nextInt();

        int resultado = fibonacci(n);
        System.out.println("El número Fibonacci en la posición " + n + " es: " + resultado);
    }

    public static int fibonacci(int n) {
        if (n < 2) return n ;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
