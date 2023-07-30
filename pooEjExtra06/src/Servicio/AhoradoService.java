package Servicio;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhoradoService {

	public Ahorcado crearJuego() {
		Ahorcado jueguito = new Ahorcado();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique la palabra a Adivinar");
    	String palabra = sc.nextLine();
    	int tamaño = palabra.length(); 
		jueguito.setPalabra(palabra, tamaño);
    	
    	System.out.println("Indique la cantidad de jugadas maximas");
		int jugadasMax = sc.nextInt();
		jueguito.setIntentos(jugadasMax);
		
		jueguito.setEncontradas(0);
		
		return jueguito;
	}
}
