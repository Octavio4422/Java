package integrante;

import java.time.LocalDate;

import utilities.Vinculo;

public abstract class Integrante {

	protected int nDeOrden;
	protected String apellido;
	protected String nombre;
	protected LocalDate fechaDeNacimiento;
	protected int dni;
	protected String sexo;
	protected Vinculo vinculo;
	protected ProblemaDeSalud problemaDeSalud;
	protected AbordajeNutricional abordajeNutricional;
	
	public Integrante() {}
	
	public Integrante(int nDeOrden, String apellido, String nombre, LocalDate fechaDeNacimiento, int dni, String sexo,
			Vinculo vinculo, ProblemaDeSalud problemaDeSalud, AbordajeNutricional abordajeNutricional) {
		this.nDeOrden = nDeOrden;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.dni = dni;
		this.sexo = sexo;
		this.vinculo = vinculo;
		this.problemaDeSalud = problemaDeSalud;
		this.abordajeNutricional = abordajeNutricional;
	}

	public int getnDeOrden() {
		return nDeOrden;
	}

	public void setnDeOrden(int nDeOrden) {
		this.nDeOrden = nDeOrden;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Vinculo getVinculo() {
		return vinculo;
	}

	public void setVinculo(Vinculo vinculo) {
		this.vinculo = vinculo;
	}
	
	public ProblemaDeSalud getProblemaDeSalud() {
		return problemaDeSalud;
	}
	
	public void setProblemaDeSalud(ProblemaDeSalud problemaDeSalud) {
		this.problemaDeSalud = problemaDeSalud;
	}
	
	public AbordajeNutricional getAbordajeNutricional() {
		return abordajeNutricional;
	}
	
	public void setAbordajeNutricional(AbordajeNutricional abordajeNutricional) {
		this.abordajeNutricional = abordajeNutricional;
	}

	@Override
	public String toString() {
		return "Integrante [nDeOrden=" + nDeOrden + ", apellido=" + apellido + ", nombre=" + nombre
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + ", dni=" + dni + ", sexo=" + sexo + ", vinculo="
				+ vinculo + ", problemaDeSalud=" + problemaDeSalud + ", abordajeNutricional=" + abordajeNutricional
				+ "]";
	}
		
}
