package Entidades;

import java.util.Arrays;
import java.util.Scanner;

public class Movil {
	Scanner sc = new Scanner(System.in);
	
	private String marca;
	private double precio;
	private String modelo;
	private int memoriaRam;
	private int almacenamiento;
	private int[] codigo = new int[7];
	
	public String toString() {
		return "Movil [marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam
				+ ", almacenamiento=" + almacenamiento + ", codigo=" + Arrays.toString(codigo) + "]";
	}
	 
	public Movil() {};
	
	public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
		this.marca = marca;
		this.precio = precio;
		this.modelo = modelo;
		this.memoriaRam = memoriaRam;
		this.almacenamiento = almacenamiento;
		this.codigo = codigo;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getMemoriaRam() {
		return memoriaRam;
	}
	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}
	public int getAlmacenamiento() {
		return almacenamiento;
	}
	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	public int[] getCodigo() {
		return codigo;
	}
	public void setCodigo(int[] codigo) {
		this.codigo = codigo;
	}
	
	public void cargarCelular() {
		System.out.println("Ingrese la marca del dispositivo");
		this.marca = sc.next();
		System.out.println("Ingrese el precio del dispositivo");
		this.precio = sc.nextDouble();
		System.out.println("Ingrese el modelo del dispositivo");
		this.modelo = sc.next();
		System.out.println("Ingrese la RAM del dispositivo");
		this.memoriaRam = sc.nextInt();
		System.out.println("Ingrese el Almacenamiento total del dispositivo");
		this.almacenamiento = sc.nextInt();
		System.out.println("Ingrese el codigo de barras");
		ingresarCodigo();
		
	}
	
	public void ingresarCodigo() {
		for (int i = 0; i < codigo.length; i++) {
			System.out.println("Ingrese el digito numero " + (i +1));
			this.codigo[i] = sc.nextInt();
		}
	}
	
}
