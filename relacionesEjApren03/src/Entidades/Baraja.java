package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import Enums.Palo;

public class Baraja {
	Scanner sc = new Scanner(System.in);
	private ArrayList<Carta> baraja = new ArrayList<>();
	private ArrayList<Carta> cartasEntregadas = new ArrayList<>();
	
	public ArrayList<Carta> getBaraja() {
		return baraja;
	}

	public void setBaraja(ArrayList<Carta> baraja) {
		this.baraja = baraja;
	}
	
	public void llenarBaraja() {
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 13; j++) {
				if( j ==8 || j == 9 ) continue;
				Carta c = new Carta();
				c.setNumero(j);
				c.setPalo(Palo.values()[i]);
				baraja.add(c);				
			}
		}
	}
	
	public void barajar() {
		Collections.shuffle(baraja);
	}
	
	public Carta siguienteCarta() {
		Carta c = null;
		
		if(baraja.size() > 0) {
			c = baraja.get(0);
			cartasEntregadas.add(baraja.get(0));
			baraja.remove(0);
		} else {
			System.out.println("El mazo esta vacio");
		}
		
		return c;
	}
	
	public int cartasDisponibles() {
		return baraja.size();
	}
	
	public ArrayList<Carta> darCartas() {
		ArrayList<Carta> dadas = new ArrayList<>();

		System.out.println("Cuantas cartas queres?");
		int n = sc.nextInt();
		
		if(n < baraja.size()) {
			for (int i = 0; i < n; i++) {
				Carta c = baraja.get(0);
				cartasEntregadas.add(baraja.get(0));
				dadas.add(baraja.get(0));
				baraja.remove(0);
			}
		}else {
			System.out.println("No te puedo dar esa cantidad");
		}
		return dadas;
	}
	
	public ArrayList<Carta> cartasMonton() {
		return cartasEntregadas;
	}
	
	public ArrayList<Carta> mostrarBaraja() {
		return getBaraja();
	}

	@Override
	public String toString() {
		return "Baraja [baraja=" + baraja + "]";
	}
	
	
}
