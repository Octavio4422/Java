package integrante;

import java.time.LocalDate;

import utilities.Vinculo;

public class AdultoMayor extends Integrante {

	private boolean jubilacion;
	
	public AdultoMayor() {}

	public AdultoMayor(int nDeOrden, String apellido, String nombre, LocalDate fechaDeNacimiento, int dni, String sexo,
			Vinculo vinculo, ProblemaDeSalud problemaDeSalud, AbordajeNutricional abordajeNutricional) {
		super(nDeOrden, apellido, nombre, fechaDeNacimiento, dni, sexo, vinculo, problemaDeSalud, abordajeNutricional);
	}

	public AdultoMayor(int nDeOrden, String apellido, String nombre, LocalDate fechaDeNacimiento, int dni, String sexo,
			Vinculo vinculo, ProblemaDeSalud problemaDeSalud, AbordajeNutricional abordajeNutricional,
			boolean jubilacion) {
		super(nDeOrden, apellido, nombre, fechaDeNacimiento, dni, sexo, vinculo, problemaDeSalud, abordajeNutricional);
		this.jubilacion = jubilacion;
	}
	
	public boolean isJubilacion() {
		return jubilacion;
	}
	
	public void setJubilacion(boolean jubilacion) {
		this.jubilacion = jubilacion;
	}
	
}
