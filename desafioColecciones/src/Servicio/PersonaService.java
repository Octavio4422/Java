package Servicio;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Persona;

public class PersonaService {
	Scanner sc = new Scanner(System.in);
	ArrayList<Persona> personas = new ArrayList<>();
	
	public void registrarPersonas() {
		System.out.println("Ingrese su nombre");
		String nombre = sc.next();
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();
		System.out.println("Ingrese su dni");
		int dni = sc.nextInt();
		System.out.println("Ingrese su pais de origen");
		String pais = sc.next();
		
		personas.add(new Persona(nombre, edad, dni, pais));
		System.out.println("el usuario fue registrado con exito");
	}
	
}
