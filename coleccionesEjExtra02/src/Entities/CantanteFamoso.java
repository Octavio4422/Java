package Entities;

public class CantanteFamoso {
	private String nombre;
	private String dicoConMasVentas;
	
	public CantanteFamoso() {}

	public CantanteFamoso(String nombre, String dicoConMasVentas) {
		this.nombre = nombre;
		this.dicoConMasVentas = dicoConMasVentas;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDicoConMasVentas() {
		return dicoConMasVentas;
	}
	
	public void setDicoConMasVentas(String dicoConMasVentas) {
		this.dicoConMasVentas = dicoConMasVentas;
	}

	@Override
	public String toString() {
		return "CantanteFamoso [nombre=" + nombre + ", dicoConMasVentas=" + dicoConMasVentas + "]";
	}
		
}
