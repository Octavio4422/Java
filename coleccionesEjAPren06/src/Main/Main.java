package Main;

import java.util.Scanner;

import Services.TiendaService;

//necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.

public class Main {

	public static void main(String[] args) {
		menu();
		System.out.println("Nos vemos papá");
	}
	
	private static void menu() {
		Scanner sc = new Scanner(System.in);
		TiendaService ts = new TiendaService();
	
		System.out.println("Bienvenido al menu");

		int opc;
		
		do {
			mostrarMenu();
			opc = sc.nextInt();
			
			switch (opc) {
			case 1: {
				ts.crearProducto();
				break;
			}
			case 2: {
				ts.eliminarProducto();
				break;
			}
			case 3: {
				ts.modificarProducto();
				break;
			}
			case 4: {
				ts.mostarProductos();
				break;	
			}
			case 5: {
				System.out.println("Saliendo de la app");
				break;
			}
			default:
				System.out.println("Opcion invalida intentelo nuevamente");;
			}
		}while(opc != 5);
		
	}
	
	private static void mostrarMenu() {
		System.out.println("");
		System.out.println("/////////////////////////////////////////");
		System.out.println("Ingrese 1 para añadir un producto");
		System.out.println("Ingrese 2 para eliminar un producto");
		System.out.println("Ingrese 3 para modificar un producto");
		System.out.println("Ingrese 4 para ver todos los productos");
		System.out.println("Ingrese 5 para salir");
		System.out.println("/////////////////////////////////////////");
		System.out.println("");
		System.out.println("Seleccione un numero");
	}
}
