package Entidades;

import java.util.Objects;

public class Alumno {
	private String nombre;
	private Integer dni;
	private Integer cantidadDeVotos = 0;
	private Voto votos;
	
	public Alumno() {}

	public Alumno(String nombre, Integer dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	public Alumno(String nombre, Integer dni, Integer cantidadDeVotos) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.cantidadDeVotos = cantidadDeVotos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getCantidadDeVotos() {
		return cantidadDeVotos;
	}

	public void setCantidadDeVotos(Integer cantidadDeVotos) {
		this.cantidadDeVotos = cantidadDeVotos;
	}
	
	public Voto getVotos() {
		return votos;
	}

	public void setVotos(Voto votos) {
		this.votos = votos;
	}

	@Override
	public String toString() {
		return " [nombre=" + nombre + ", dni=" + dni + ", cantidadDeVotos=" + cantidadDeVotos + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidadDeVotos, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(cantidadDeVotos, other.cantidadDeVotos) && Objects.equals(dni, other.dni)
				&& Objects.equals(nombre, other.nombre);
	}
}
