package Main;

import Servicios.PeliculaService;

import java.util.Collections;

import Entidades.PeliculasComparator;

public class Main {

	public static void main(String[] args) {
		PeliculaService ps = new PeliculaService();
		
		ps.crearCartelera();
		  System.out.println("Mostrando la cartelera con una duracion mayor a una hora" +ps.mayorUnaHora());
		  
		  Collections.sort(ps.getCartelera(), PeliculasComparator.duracionDes);
		  
		  System.out.println("Mostrando la cartelera con duracion Desc" + ps.mostrarCartelera());
		  
		  Collections.sort(ps.getCartelera(), PeliculasComparator.duracionAsc);
		  
		  System.out.println("Mostrando la cartelera con duracion Asc" + ps.mostrarCartelera());
		  
		  Collections.sort(ps.getCartelera(), PeliculasComparator.directorAsc);
		  
		  System.out.println("Mostrando la cartelera con director Asc" + ps.mostrarCartelera());
		  
		  Collections.sort(ps.getCartelera(), PeliculasComparator.peliclasAlf);
		  
		  System.out.println("Mostrando la cartelera con titulo Asc" + ps.mostrarCartelera());
	}

}
