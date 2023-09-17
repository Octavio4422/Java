package Main;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Baraja;
import Entidades.Carta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baraja baraja = new Baraja();

		Scanner sc = new Scanner(System.in);
        menu: while (true) {
            System.out.println("-------------------------");
            System.out.println("Ingrese opcion del menu:");
            System.out.println("1. Barajar");
            System.out.println("2. Siguiente carta");
            System.out.println("3. Cartas disponibles");
            System.out.println("4. Dar cartas");
            System.out.println("5. Cartas monton");
            System.out.println("6. Mostrar baraja");
            System.out.println("7. Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    baraja.barajar();
                    break;
                case 2:
                    Carta ca = baraja.siguienteCarta();
                    if (ca == null)
                        System.out.println("No hay cartas disponibles");
                    else
                        System.out.println("La siguiente carta es: " + ca.toString());
                    break;
                case 3:
                    System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles());
                    break;
                case 4:
                    System.out.println("¿Cuantas cartas querés sacar?");
                    int cant = sc.nextInt();
                    ArrayList<Carta> devueltas = baraja.darCartas();
                    if (devueltas.size() == 0)
                        System.out.println("No hay cartas disponibles");
                    else {
                        System.out.println("Se han devuelto " + devueltas.size() + " cartas");
                        System.out.println(devueltas.toString());
                    }
                    break;
                case 5:
                    baraja.cartasMonton();
                    break;
                case 6:
                    baraja.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break menu;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        sc.close();
	}

}
