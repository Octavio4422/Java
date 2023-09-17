package Main;

import java.util.ArrayList;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;

public class Main {

	public static void main(String[] args) {
		ArrayList<Electrodomestico> cosas = new ArrayList<>();
		int total = 0;
		
		Televisor t1 = new Televisor(1000, "azul", 'E', 6, 42, true );
		Televisor t2 = new Televisor(2000, "amarillo", 'F', 10, 80, false);
		Lavadora l1 = new Lavadora(1500, "negro", 'A', 15, 20);
		Lavadora l2 = new Lavadora(1250, "verde", 'D', 12, 35);

		cosas.add(t1);
		cosas.add(t2);
		cosas.add(l1);
		cosas.add(l2);
		
		for (Electrodomestico e : cosas) {
			e.precioFinal();
			total += e.getPrecio();
		}
			
		System.out.println(total);
	}
}
