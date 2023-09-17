package Entidades;

import java.util.Date;

public class Reserva {
	private int id;
	private int numeroDeHabitacion;
	private int cantidadDePersonas;
	private Date fechaInicio;
	private Date fechaFin;
	
	public Reserva() {}

	public Reserva(int id, int numeroDeHabitacion, int cantidadDePersonas, Date fechaInicio, Date fechaFin) {
		this.id = id;
		this.numeroDeHabitacion = numeroDeHabitacion;
		this.cantidadDePersonas = cantidadDePersonas;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroDeHabitacion() {
		return numeroDeHabitacion;
	}

	public void setNumeroDeHabitacion(int numeroDeHabitacion) {
		this.numeroDeHabitacion = numeroDeHabitacion;
	}

	public int getCantidadDePersonas() {
		return cantidadDePersonas;
	}

	public void setCantidadDePersonas(int cantidadDePersonas) {
		this.cantidadDePersonas = cantidadDePersonas;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

}
