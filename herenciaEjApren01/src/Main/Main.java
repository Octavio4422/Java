package Main;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Main {

	public static void main(String[] args) {
		Animal p1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
		p1.Alimentarse();
		
		Animal p2 = new Perro("Teddy", "croquetas", 10, "Chihuhua");
		p2.Alimentarse();
		
		Animal g1 = new Gato("Pelusa", "Galletas", 15, "Satanas");
		g1.Alimentarse();
		
		Animal c1 = new Caballo("Spark", "Pasto", 25, "Fino");
		c1.Alimentarse();
	}
}
