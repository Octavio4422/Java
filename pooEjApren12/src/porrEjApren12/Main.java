package porrEjApren12;
import Entidades.Persona;
import Services.PersonaService;

// Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//se recibe como parámetro, o false en caso contrario.

// Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaService ps = new PersonaService();
		
		Persona uno = ps.crearPersona();
		
		System.out.println(uno.getNombre()+ " tiene " + ps.calcularEdad(uno)+ " años");
	
		if(uno.menorQue(15)) System.out.println("e vero");
		else System.out.println("e falso");
	}

}
