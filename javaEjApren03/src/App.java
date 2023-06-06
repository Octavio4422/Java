// Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
// en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
// Java.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner leer = new Scanner(System.in); 

       System.out.println("Ingresa una frase maestro");
       String frase = leer.nextLine();

       System.out.println("Aca tenes la frase en mayusculas");
       System.out.println(frase.toUpperCase());
       System.out.println("Aca tenes la frase en minusculas");
       System.out.println(frase.toLowerCase());
    }
}
