package Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico{

	Scanner sc = new Scanner(System.in);
		
	private int res;
	private boolean tdt;
		
	public Televisor() {}

	public Televisor(int precio, String color, char ce, int peso, int res, boolean tdt) {
		super(precio, color, ce, peso);
		this.res = res;
		this.tdt = tdt;
	}

	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}

	public boolean isTdt() {
		return tdt;
	}

	public void setTdt(boolean tdt) {
		this.tdt = tdt;
	}

	public void crearTelevisor() {
		super.crearElectrodomestico();
		System.out.println("ingrese las pulgadas del televisor");
		setRes(sc.nextInt());
		System.out.println("si tiene sintonizador o no s o n");
		String l = sc.nextLine();
		System.out.println("");
		if(l.equalsIgnoreCase("s")) setTdt(true);
		else if(l.equalsIgnoreCase("n")) setTdt(false);
		else System.out.println("Daaaale");
	}
	
	public void precioFinal() {
		super.precioFinal();
		if(this.res > 40)setPrecio(getPrecio() + (int) Math.round(getPrecio() * 0.30));
		if(this.tdt) setPrecio(getPrecio() + 500);
	}


}
