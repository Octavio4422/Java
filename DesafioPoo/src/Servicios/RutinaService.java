package Servicios;

import java.util.ArrayList;
import java.util.Scanner;
import Entidades.Rutina;

public class RutinaService {
	Scanner sc = new Scanner(System.in);
	private ArrayList<Rutina> listaRutinas = new ArrayList<>();

	public ArrayList<Rutina> obtenerRutinas() {
		return this.listaRutinas;
	}

	public Rutina crearRutina() {
		Rutina r = new Rutina();
		
		if(listaRutinas.size() == 0 ) {
			r.setId(1);
		} else {
			r.setId(listaRutinas.size() + 1);
		}

		System.out.println("Ingrese el nombre de la rutina");
		r.setNombre(sc.next());
		System.out.println("Ingrese la duracion");
		r.setDuracion(sc.nextInt());
		System.out.println("Ingrese el nivel de dificultad (facil, intermedio, dificil)");
		r.setNivelDificultad(sc.next());
		System.out.println("Ingrese su descipcion");
		r.setDescripcion(sc.next());

		listaRutinas.add(r);
		return r;
	}

	public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
//		this.listaRutinas.forEach(rutina -> {
//			if (rutina.getId() == id) {
//				rutina.setNombre(nombre);
//				rutina.setDuracion(duracion);
//				rutina.setNivelDificultad(nivelDificultad);
//				rutina.setDescripcion(descripcion);
//			}
//		});
		
		 boolean check =false;
	        for (Rutina rutina : listaRutinas)  {
	            if (rutina.getId() == id) {
	                check = true;
	                rutina.setNombre(nombre);
	                rutina.setDuracion(duracion);
	                rutina.setNivelDificultad(nivelDificultad);
	                rutina.setDescripcion(descripcion);
	                System.out.println("Modificado exitosamente");
	            }
	        }
	        if(!check) {
	            System.out.println("No existe el ID");
	        }

	}

	public void eliminarRutina(int id) {
		int i = 0;
		if (this.listaRutinas.size() > 0) {
			for (Rutina r : listaRutinas) {
				if (r.getId() == id) {
					i = listaRutinas.indexOf(r);
				}
			}
			System.out.println(i);
			listaRutinas.remove(i);
		} else {
			System.out.println("no hay nada para eliminar bro");
		}

	}
}
