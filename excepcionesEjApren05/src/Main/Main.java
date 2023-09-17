package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeroAleatorio = (int) (Math.random() * 500) + 1;
		int n = 0;
		int c = 0;

		System.out.println(numeroAleatorio);

		do {
			System.err.println("ingrese un numero");
			try {
				n = sc.nextInt();
			} catch (NumberFormatException e) {
				System.out.println(e);
			} catch (InputMismatchException ime) {
				System.out.println(ime);
				sc.next();
			} finally {
				c += 1;
			}

		} while (n != numeroAleatorio);

		System.err.println("felicitaciones locura lo lograste en " + c + " intentos");

//		Scanner input = new Scanner(System.in);
//
//		int random = (int) Math.round(Math.random() * 500);
//
//		int contador = 0;
//		int opcion = 0;
//		do {
//			System.out.println("Ingrese el numero a adivinar");
//
//			try {
//				opcion = Integer.parseInt(input.nextLine());
//
//				if (opcion > random) {
//					System.out.println("El numero es menor a " + opcion);
//				} else if (opcion < random) {
//					System.out.println("El numero es mayor a " + opcion);
//				}
//			} catch (NumberFormatException e) {
//				System.out.println("No es un numero " + e.getMessage());
//			} finally {
//				contador += 1;
//			}
//		} while (opcion != random);
//
//		System.out.println("Lo lograste en " + contador + " intentos!");
//		input.close();
	}
}
