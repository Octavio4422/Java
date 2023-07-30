package Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Entidades.Alumno;

public class AlumnoService {
	Scanner sc = new Scanner(System.in);
	ArrayList<Alumno> listaAlumnos = new ArrayList<>();
	
	@Override
	public String toString() {
		return "AlumnoService [listaAlumnos=" + listaAlumnos + "]";
	}

	public ArrayList<Alumno> crearAlumno() {
		char opcion;
		
		do {
			Alumno a = new Alumno();
			System.out.println("Ingrese el nombre del alumno");
			a.setNombre(sc.next());
			
			for (int i = 0; i < 3; i++) {
				System.out.println("ingrese la nota numero " + i+1 + " del alumno " + a.getNombre());	
				a.getNotas().add(sc.nextInt());
			}
			
			listaAlumnos.add(a);
			System.out.println("Desea agregar otro? Ingrese S para si o N para no");
			opcion = sc.next().toUpperCase().charAt(0);

		}while(opcion == 'S');
		
		return listaAlumnos;
	}
	
	public int notaFinal(String nombre) {
		
		int suma = 0 ;
		
		for(Alumno a: listaAlumnos) {
			if(a.getNombre().equals(nombre)) {
				for (int i = 0; i < a.getNotas().size(); i++) {
					suma += a.getNotas().get(i);
				}
			}
		}
		
		return suma / 3;
	}
}
