package pooEjExtra06;

import Entidades.Ahorcado;
import Servicio.AhoradoService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AhoradoService as = new AhoradoService();
		Ahorcado juegoUno = as.crearJuego();
	
		System.out.println(juegoUno.longitud());
	}

}
