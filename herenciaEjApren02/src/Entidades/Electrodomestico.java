package Entidades;

import java.util.Scanner;

public class Electrodomestico {
	Scanner sc = new Scanner(System.in);

	protected int precio;
	protected String color;
	protected char ce;
	protected int peso;

	public Electrodomestico() {
	};

	public Electrodomestico(int precio, String color, char ce, int peso) {
		this.precio = precio;
		this.color = color;
		this.ce = ce;
		this.peso = peso;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getCe() {
		return ce;
	}

	public void setCe(char ce) {
		this.ce = ce;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

//	public char comprobarConsumoEnergetico(char l) {
//		System.out.println("comp" + l);
//		if (!((int) l < 65 || (int) l > 70)) {
//			setCe('F');
//			return 'F';
//		} else {
//			setCe(l);
//			return l;
//		}
//	}

	public char comprobarConsumoEnergetico(char energy) {
		  return (String.valueOf(energy).matches("[A-Fa-f]")) ? energy : 'F';
		 }
	
	public String comprobarColor(String color) {
		switch (color.toUpperCase()) {
		case "NEGRO": {
			setColor("negro");
			return "negro";
		}
		case "ROJO": {
			setColor("rojo");
			return "rojo";
		}
		case "AZUL": {
			setColor("azul");
			return "azul";
		}
		case "GRIS": {
			setColor("gris");
			return "gris";
		}
		default:
			setColor("blanco");
			return "blanco";
		}
	}

	public void crearElectrodomestico() {
		System.out.println("Ingrese el precio del electrodomestico, minimo 1000 pa");
		setPrecio(sc.nextInt());
		System.out.println("Ingrese el color del electrodomestico");
		setColor(comprobarColor(sc.next()));
		System.out.println("Ingrese la letrita");
		setCe(comprobarConsumoEnergetico(sc.next().charAt(0)));
		System.out.println("Ingrese el peso del electrodomestico");
		setPeso(sc.nextInt());
	}

	public void precioFinal() {
		switch (this.ce) {
		case 'A': {
			setPrecio(precio + 1000);
			break;
		}
		case 'B': {
			setPrecio(precio + 800);
			break;
		}
		case 'C': {
			setPrecio(precio + 600);
			break;
		}
		case 'D': {
			setPrecio(precio + 500);
			break;
		}
		case 'E': {
			setPrecio(precio + 300);
			break;
		}                                                            
		case 'F': {	                     
			setPrecio(precio + 100);   
			break;                       
		}
		default:
			throw new IllegalArgumentException("Unexpected value");
		}
		
		if(peso > 80) setPrecio(precio + 1000);
		else if(peso > 50 && peso < 79) setPrecio(precio + 800);
		else if(peso > 20 && peso < 49) setPrecio(precio + 500);
		else if(peso > 1 && peso < 19) setPrecio(precio + 100);
		else System.out.println("Te mandaste un moco");
		
	}
}
