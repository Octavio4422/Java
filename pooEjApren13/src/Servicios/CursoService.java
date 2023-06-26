package Servicios;

import java.util.Iterator;
import java.util.Scanner;

import Entidades.Curso;

public class CursoService {
	Scanner sc = new Scanner(System.in);
	// método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
	//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
	//en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
	//nombre de cada alumno.
	public void cargarAlumnos(Curso obj) {
		String[] alum = new String[obj.getAlumnos().length];
		
		
		for (int i = 0; i < alum.length; i++) {
			System.out.println("Ingrese el nombre del alumno " + (i + 1));
			alum[i] = sc.next();
		}
		
		obj.setAlumnos(alum);
	}
	
	// Método crearCurso(): el método crear curso, le pide los valores de los atributos al
	//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
	//Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
	//al atributo alumnos
	
	public Curso crearCurso() {
		Curso nuevCurso = new Curso();
		
		System.out.println("Ingrese el nombre del curso");
		nuevCurso.setNombreCurso(sc.next());
		
		System.out.println("Ingrese la cantida de horas dictadas por dia");
		nuevCurso.setCantidadHorasPorDia(sc.nextInt());
		
		System.out.println("Ingrese la cantidad de dias del curso por semana");
		nuevCurso.setCantidadDiasPorSemana(sc.nextInt());
		
		System.out.println("Ingrese el turno en el que se dicta el curso. MAÑANA o TARDE");
		nuevCurso.setTurno(sc.next().toLowerCase());
		
		System.out.println("Ingrese el precio del curso por hora");
		nuevCurso.setPrecioPorHora(sc.nextDouble());
		
		System.out.println("Ingrese a los alumnos inscriptos");
		cargarAlumnos(nuevCurso);
		
		return nuevCurso;
	}



	// Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
	//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
	//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
	//se repite el encuentro.
	public double calcularGanciaSemanal(Curso obj) {
		 return obj.getCantidadHorasPorDia() * obj.getPrecioPorHora() * obj.getAlumnos().length * obj.getCantidadDiasPorSemana();
		
	}
}
