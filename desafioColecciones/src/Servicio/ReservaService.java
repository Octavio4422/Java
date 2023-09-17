package Servicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entidades.Reserva;

public class ReservaService {
	Scanner sc = new Scanner(System.in);
	
	HabitacionService hs = new HabitacionService();
	
	ArrayList<Reserva> reservas = new ArrayList<>();
	
	public void crearReserva() {
		System.out.println("Ingrese el numero de personas");
		int numeroPersonas = sc.nextInt();
		
//		System.out.println("Ingrese la fecha de Inicio");
//		System.out.println("Dia");
//		int dia = sc.nextInt();
//		System.out.println("Mes");
//		int mes = sc.nextInt();
//		System.out.println("Año");
//		int anio = sc.nextInt();
//		
//		Date inicio = new Date(dia,mes,anio-1900);
		
		System.out.println(hs.getCapacidadHabitaciones().get(numeroPersonas));
			
		
	}

}
