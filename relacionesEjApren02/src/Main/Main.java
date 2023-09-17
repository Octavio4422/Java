package Main;

import java.util.ArrayList;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;

public class Main {

	public static void main(String[] args) {
		ArrayList<Jugador> jugadores = new ArrayList<>();
		RevolverDeAgua r = new RevolverDeAgua();
		Juego j = new Juego();
		
		r.llenarRevolver();
		jugadores.add( new Jugador(1, "Octavio", false));
		jugadores.add( new Jugador(2, "Octa", false));
		jugadores.add( new Jugador(3, "Octi", false));
		jugadores.add( new Jugador(4, "Octu", false));
		jugadores.add( new Jugador(5, "Oct5", false));
		jugadores.add( new Jugador(6, "Oct6", false));
		
		j.llenarJuego(jugadores, r);
		j.ronda();

	}

}
