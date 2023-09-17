package integrante;

import java.time.LocalDate;

import utilities.Vinculo;

public class Joven extends Integrante {

	private String estudio;
	private boolean deporte;
	private boolean trabajo;
	
	public Joven() {}
	
	public Joven(int nDeOrden, String apellido, String nombre, LocalDate fechaDeNacimiento, int dni, String sexo,
			Vinculo vinculo, ProblemaDeSalud problemaDeSalud, AbordajeNutricional abordajeNutricional) {
		super(nDeOrden, apellido, nombre, fechaDeNacimiento, dni, sexo, vinculo, problemaDeSalud, abordajeNutricional);
	}

	public Joven(int nDeOrden, String apellido, String nombre, LocalDate fechaDeNacimiento, int dni, String sexo,
			Vinculo vinculo, ProblemaDeSalud problemaDeSalud, AbordajeNutricional abordajeNutricional, String estudio,
			boolean deporte, boolean trabajo) {
		super(nDeOrden, apellido, nombre, fechaDeNacimiento, dni, sexo, vinculo, problemaDeSalud, abordajeNutricional);
		this.estudio = estudio;
		this.deporte = deporte;
		this.trabajo = trabajo;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public boolean isDeporte() {
		return deporte;
	}

	public void setDeporte(boolean deporte) {
		this.deporte = deporte;
	}

	public boolean isTrabajo() {
		return trabajo;
	}

	public void setTrabajo(boolean trabajo) {
		this.trabajo = trabajo;
	}

	@Override
	public String toString() {
		return "Joven [estudio=" + estudio + ", deporte=" + deporte + ", trabajo=" + trabajo + "]";
	}
	
	
	
}
