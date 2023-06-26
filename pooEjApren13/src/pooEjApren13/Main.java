package pooEjApren13;

import Entidades.Curso;
import Servicios.CursoService;

//Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
//programa para organizar la información de cada curso. Para ello, crearemos una clase
//entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
//cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
//alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
//nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
// Un constructor por defecto.
// Un constructor con todos los atributos como parámetro.
// Métodos getters y setters de cada atributo.

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CursoService cs = new CursoService();
		
		Curso cursillo = cs.crearCurso();
		
		System.out.println(cs.calcularGanciaSemanal(cursillo));
		
	}

}
