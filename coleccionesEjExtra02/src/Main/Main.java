package Main;

import java.util.ArrayList;
import java.util.Scanner;
import Entities.CantanteFamoso;


public class Main {

	public static void main(String[] args) {
		ArrayList<CantanteFamoso> lolla = new ArrayList<>();

		lolla.add(new CantanteFamoso("Messi", "Qatar2022"));
		lolla.add(new CantanteFamoso("Riquelme", "Libertadores2007"));
		lolla.add(new CantanteFamoso("Guns n Roses", "Appetite FD"));
		lolla.add(new CantanteFamoso("Maluma", "Pretty boy, DB"));
		lolla.add(new CantanteFamoso("AVICII", "True"));

		for (CantanteFamoso cf : lolla) {
			System.out.println(cf);
		}
		
		menu();
		
	}

	private static void menu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido al menu");

		int opc;

		do {
			mostrarMenu();
			opc = sc.nextInt();

			switch (opc) {
			case 1: {

				break;
			}
			case 2: {

				break;
			}
			case 3: {

				break;
			}
			case 4: {
				System.out.println("Saliendo de la app");
				break;
			}
			default:
				System.out.println("Opcion invalida intentelo nuevamente");
				
			}
		} while (opc != 4);

	}

	private static void mostrarMenu() {
		System.out.println("");
		System.out.println("/////////////////////////////////////////");
		System.out.println("Ingrese 1 para añadir un cantante");
		System.out.println("Ingrese 2 para eliminar un cantante");
		System.out.println("Ingrese 3 para ver todos los cantantes");
		System.out.println("Ingrese 4 para salir");
		System.out.println("/////////////////////////////////////////");
		System.out.println("");
		System.out.println("Seleccione un numero");
	}

}
