package Entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
	Scanner sc = new Scanner(System.in);
	
	private int carga;
	
	public Lavadora() {
		super();
	}

	public Lavadora(int precio, String color, char ce, int peso, int carga) {
		super(precio, color, ce, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public void crearLavadora() {
		super.crearElectrodomestico();
		System.out.println("Ingrese la carga maxima del lavarropes");
		setCarga(sc.nextInt());
	}
	
	public void precioFinal() {
		super.precioFinal();
		if(this.carga > 30) setPrecio(getPrecio() + 500);
	}
}
