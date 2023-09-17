package Entidades;

//import java.time.LocalDate;
import java.util.Date;

public class Habitacion {
	private int numero;
	private Date fechaDeInicio;
	private Date fechaDeFin;

	public Habitacion() {}
	
	public Habitacion(int numero) {
		this.numero = numero;
	}

	public Habitacion(int numero, Date fechaDeInicio, Date fechaDeFin) {
		this.numero = numero;
		this.fechaDeInicio = fechaDeInicio;
		this.fechaDeFin = fechaDeFin;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFechaDeInicio() {
		return fechaDeInicio;
	}

	public void setFechaDeInicio(Date fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}

	public Date getFechaDeFin() {
		return fechaDeFin;
	}

	public void setFechaDeFin(Date fechaDeFin) {
		this.fechaDeFin = fechaDeFin;
	}

	@Override
	public String toString() {
		return "Habitacion [numero=" + numero + ", fechaDeInicio=" + fechaDeInicio + ", fechaDeFin=" + fechaDeFin + "]";
	}
	
}
