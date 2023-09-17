package Main;

import java.util.ArrayList;
import java.util.Scanner;

import familia.Familia;
import integrante.Integrante;
import servicios.FamiliaServicio;
import servicios.IntegranteServicio;

public class Main {
	public static void main(String[] args) {
		System.out.println("Bienvenido al sistema de gestion del hospital");
		System.out.print("Dentro de este sistema usted prodra administrar ");
		System.out.print("los datos de las familias aledañas al hospial");
		System.out.println(" ");

		menu();
	}

	private static void menu() {
		Scanner sc = new Scanner(System.in);
		FamiliaServicio fs = new FamiliaServicio();
		IntegranteServicio is = new IntegranteServicio();

		ArrayList<Familia> familias = new ArrayList<>();
		boolean loop = true;

		do {
			if (familias.size() == 0) {
				System.out.println("Para comenzar con la gestion debera registrar a la primer familia");
				familias.add(fs.crearFamilia(familias.size()));
				System.out.println(familias);
				continue;
			} else if (familias.size() > 0) {
				System.out.println("Seleccione una opcion");
				System.out.println("1) Ver familias");
				System.out.println("2) Añadir familia");
				System.out.println("3) Modificar familia");
				System.out.println("4) Eliminar familia");
				System.out.println("5) Salir del sistema");
				int opc = sc.nextInt();

				switch (opc) {
				case 1:
					mostrarFamilias(familias);
					break;
				case 2:
					familias.add(fs.crearFamilia(familias.size()));
					break;
				case 3:
					familias = modificarFamilia(familias);
					break;
				case 4:
					familias = eliminarFamilia(familias);
					break;
				case 5:
					loop = false;
					break;
				default:
					System.out.println("opcion invalida vuelva a intentar");
					menu();
				}

			} else {
				System.err.println("??");
			}
		} while (loop);
		
		System.err.println("Hasta luego");
	}

	private static ArrayList<Familia> modificarFamilia(ArrayList<Familia> familias) {
		Scanner sc = new Scanner(System.in);
		IntegranteServicio is = new IntegranteServicio();
		FamiliaServicio fs = new FamiliaServicio();
		Familia fa;
		int n;
		do {
			System.out.println("Que familia desea modificar?");
			mostrarFamilias(familias);
			System.out.println("Ingres a continucacion el numero correspondiente");
			n = sc.nextInt();
			fa = familias.get(n);
			
			System.out.println("Usted selecciono a la familia " + fa.getIde() + ", es correcto?");
			System.out.println("Ingrese S o N");
			String opc = sc.next().toUpperCase();
			
			if(opc.equals("S")) break;
			else if(opc.equals("N")) continue;
			else {
				System.out.println("Opcion incorrecta intentelo nuevamente");
				continue;
			}			
			
		} while (true);

		System.out.println("Que modificacion desea realizar?");
		System.out.println("1) Agregar un integrante");
		System.out.println("2) Modificar un integrante");
		System.out.println("3) Eliminar un integrante");
		System.out.println("4) actualizar la informacion de la familia");
		System.out.println("5) modificar la informacion de la vivienda");
		int m = sc.nextInt();
		 
		switch (m) {
		case 1:
			Integrante i = is.crearIntegrante();
			fa.setIntegrantes(fs.agregarIntegrante(fa));
			familias.set(n, fa);
			return familias;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;

		default:
			break;
		}

		return familias;
	}
		
	private static ArrayList<Familia> eliminarFamilia(ArrayList<Familia> familias){
		Scanner sc = new Scanner(System.in);
		Familia fa;
		int n;
		
		do {
			System.out.println("Que familia desea eliminar?");
			mostrarFamilias(familias);
			System.out.println("Ingres a continucacion el numero correspondiente");
			n = sc.nextInt();
			fa = familias.get(n);
			
			System.out.println("Usted selecciono a la familia " + fa.getIde() + ", es correcto?");
			System.out.println("Ingrese S o N");
			String opc = sc.next().toUpperCase();
			
			if(opc.equals("S")) break;
			else if(opc.equals("N")) continue;
			else {
				System.out.println("Opcion incorrecta intentelo nuevamente");
				continue;
			}			
		} while (true);
		
		familias.remove(n);
		System.out.println("La familia y sus integrantes fueron eliminados con exito");
		
		return familias;
	}
	private static void mostrarFamilias(ArrayList<Familia> familias) {
		for (Familia familia : familias) {
			System.out.println(familia.getIde() + " " + familia.getDireccion());
		}
	}
}
