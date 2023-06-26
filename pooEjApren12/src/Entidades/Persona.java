package Entidades;
import java.time.LocalDate;

import Services.PersonaService;

public class Persona {
	private String nombre;
	private LocalDate fecha;
	
	public Persona() {};
	
	public Persona(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public boolean menorQue(int edad) {
		PersonaService ps = new PersonaService();
		
		int edadUno = ps.calcularEdad(this);
	
		 return edadUno < edad ? true : false;
	}
}
