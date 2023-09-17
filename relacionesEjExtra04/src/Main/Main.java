package Main;
import java.util.Collections;
import java.util.Comparator;
import Entidades.Simulador;
import Utils.Comparadores;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simulador s = new Simulador();
	
		s.generarListado(); 
		s.generarDnis(); 
		s.crearAlumnos();
		s.votacion(s.getAlumnos());
//		System.out.println(s.getAlumnos());
		
		Collections.sort(s.getAlumnos(), Comparadores.ordenarVotoMax);
		System.out.println(s.getAlumnos().toString());
	}

}
