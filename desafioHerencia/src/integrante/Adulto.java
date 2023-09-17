package integrante;

import java.time.LocalDate;

import utilities.Vinculo;

public class Adulto extends Integrante {

	private boolean estudio;
	private boolean deporte;
	private boolean trabajo;
	private boolean obraSocial;
	
	public Adulto() {}
		
	public Adulto(int nDeOrden, String apellido, String nombre, LocalDate fechaDeNacimiento, int dni, String sexo,
			Vinculo vinculo, ProblemaDeSalud problemaDeSalud, AbordajeNutricional abordajeNutricional) {
		super(nDeOrden, apellido, nombre, fechaDeNacimiento, dni, sexo, vinculo, problemaDeSalud, abordajeNutricional);
	}

	public Adulto(int nDeOrden, String apellido, String nombre, LocalDate fechaDeNacimiento, int dni, String sexo,
			Vinculo vinculo, ProblemaDeSalud problemaDeSalud, AbordajeNutricional abordajeNutricional, boolean estudio,
			boolean deporte, boolean trabajo, boolean obraSocial) {
		super(nDeOrden, apellido, nombre, fechaDeNacimiento, dni, sexo, vinculo, problemaDeSalud, abordajeNutricional);
		this.estudio = estudio;
		this.deporte = deporte;
		this.trabajo = trabajo;
		this.obraSocial = obraSocial;
	}

	public boolean isEstudio() {
		return estudio;
	}
	
	public void setEstudio(boolean estudio) {
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

	public boolean isObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(boolean obraSocial) {
		this.obraSocial = obraSocial;
	}

	@Override
	public String toString() {
		return "Adulto [estudio=" + estudio + ", deporte=" + deporte + ", trabajo=" + trabajo + ", obraSocial="
				+ obraSocial + "]";
	}
	
}
