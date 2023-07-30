package Main;

import Services.AlumnoService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlumnoService as = new AlumnoService();
		
		System.out.print(as.crearAlumno());
		System.out.println(as.notaFinal("Octavio"));
	}

}
