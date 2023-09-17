package Entidades;

import java.util.ArrayList;

public class Juego {
	private RevolverDeAgua revolver;
	private ArrayList<Jugador> jugadores;
			
	public Juego() {}

	public Juego(RevolverDeAgua revolver, ArrayList<Jugador> jugadores) {
		this.revolver = revolver;
		this.jugadores = jugadores;
	}

	public RevolverDeAgua getRevolver() {
		return revolver;
	}

	public void setRevolver(RevolverDeAgua revolver) {
		this.revolver = revolver;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
		setJugadores(jugadores);
		setRevolver(revolver);
		
	}
	
	public void ronda() {
		boolean tiro = true;
		
		do {
			for (Jugador j : jugadores) {
				System.out.println("Es el turno de " + j.getNombre());
				j.disparo(revolver);
				if(j.isMojado()) {
					tiro = false;
					break;
				}
				System.out.println("El siguiente");
			}
			
		}while(tiro);
			
		System.out.println("Se termino el juego");
	}
}
