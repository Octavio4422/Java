package pooEjApren07;
/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/

import Entidad.Persona;
import Service.PersonaService;


public class Main {

	public static void main(String[] args) {
		//entidad controladora de persona
		PersonaService ps = new PersonaService();
		
		//creamos las persona
		Persona personaUno = ps.crearPersona();
		Persona personaDos = ps.crearPersona();
		
		
		if(ps.esMayorDeEdad(personaUno)) System.out.println(personaUno.getNombre() + " Es mayor de edad") ;
		else System.out.println(personaUno.getNombre() + "No es mayor de edad");
		
		if(ps.esMayorDeEdad(personaDos)) System.out.println(personaDos.getNombre() + " Es mayor de edad") ;
		else System.out.println(personaDos.getNombre() + "No es mayor de edad");
		
		System.out.println(ps.calcularIMC(personaUno));
		System.out.println(ps.calcularIMC(personaDos));
	}

}
