package Services;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import Entidades.Persona;

public class PersonaService {
	Scanner sc = new Scanner(System.in);

	public Persona crearPersona() {
		int dia, mes, anio;
		
		System.out.println("Ingrese el nombre de la Persona");
		String nombre = sc.next();
		
		
		System.out.println("Ingrese en orden dd/mm/aa");
		dia = sc.nextInt();
		mes = sc.nextInt();
		anio = sc.nextInt();
		LocalDate fecha = LocalDate.of(anio, mes, dia);
		
		return new Persona(nombre, fecha);
	}
	
	
	public int calcularEdad(Persona obj) {
		//almacena la fecha actual
		LocalDate fechaActual = LocalDate.now();
		
		LocalDate anioNac = obj.getFecha();

		Period edad = anioNac.until(fechaActual);
		return edad.getYears();
	}
	
}
