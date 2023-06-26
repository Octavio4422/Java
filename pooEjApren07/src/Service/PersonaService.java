package Service;
import Entidad.Persona;
import java.util.Scanner;

public class PersonaService {
	public Persona crearPersona() {
		Scanner sc = new Scanner(System.in);
		Persona newPersona = new Persona();
		String t;
		
		System.out.println("Cual es tu nombre?");
		newPersona.setNombre(sc.next());
		
		System.out.println("Cual es tu edad");
		newPersona.setEdad(sc.nextInt());
		
		System.out.println("Cual es tu sexo? ingrese h-m-o");
		t =sc.next();
		
		while(!t.equalsIgnoreCase("h") && !t.equalsIgnoreCase("m") && !t.equalsIgnoreCase("o")) {
			System.out.println("Ingrese un sexo valido");
			t =sc.next();
		}
		
		newPersona.setSexo(t);
		
		System.out.println("Cual es tu peso?");
		newPersona.setPeso(sc.nextDouble());
		
		System.out.println("Cual es tu altura?");
		newPersona.setAltura(sc.nextDouble());
		
		return newPersona;
	}
	
	public boolean esMayorDeEdad(Persona pepito) {
		int edad = pepito.getEdad();
		
		if(edad >= 18) return true;
		else return false;
	}

	public int calcularIMC(Persona pepito) {
		double peso = pepito.getPeso();
		double altura = pepito.getAltura();
		
		double calculo = peso / Math.pow(altura, 2);
		
		if(calculo < 20) return -1;
		else if(calculo >= 20 && calculo <= 25) return 0;
		else return 1;
	}
}
