package Entidades;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int anio;
	private String tipo;
	
	//variable no 
	private int distancia;
	
	public Vehiculo() {}
	
		
	public Vehiculo(String marca, String modelo, int anio, String tipo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getDistancia() {
		return distancia;
	}
	
	public void moverse(int sec) {
		switch(tipo.toLowerCase()) {
		 case "moto":
			 distancia += sec *2;
			 break;
		 case "auto":
			 distancia += sec *3;
			 break;
		 case "bicicleta":
			 distancia += sec *1;
			 break;
		default: 
			System.out.println("Que rompimos");
		}
	}
	
	public void frenar() {
		switch(tipo.toLowerCase()) {
		 case "moto":
			 distancia += 2;
			 System.out.println("La motito recorrio hasta que frenaste: " + distancia + " mtrs");
			 distancia = 0;
			 break;
		 case "auto":
			 distancia += 2;
			 System.out.println("El autito recorrio hasta que frenaste: " + distancia + " mtrs");
			 distancia = 0;
			 break;
		 case "bicicleta":
			 System.out.println("La bicicleta recorrio hasta que frenaste: " + distancia + " mtrs");
			 
			 break;
		default: 
			System.out.println("Que rompimos");
		}
	}
	
}
