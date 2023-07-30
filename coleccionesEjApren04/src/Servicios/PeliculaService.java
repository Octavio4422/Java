package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Pelicula;

public class PeliculaService {
	
	Scanner sc = new Scanner(System.in);
	private ArrayList<Pelicula> cartelera = new ArrayList<>();

	public ArrayList<Pelicula> getCartelera() {
		return cartelera;
	}

	public void setCartelera(ArrayList<Pelicula> cartelera) {
		this.cartelera = cartelera;
	}

	@Override
	public String toString() {
		return "PeliculaService [cartelera=" + cartelera + "]";
	}

	public ArrayList<Pelicula> crearCartelera() {

		char opcion;
		do {
			Pelicula p = new Pelicula();
			System.out.println("Ingrese los datos de la pelicula");
			System.out.println("Ingrese el Titulo");
			p.setTitulo(sc.next());
			System.out.println("Ingrese el Director");
			p.setDirector(sc.next());
			System.out.println("Ingrese la duracion");
			p.setDuracion(sc.nextDouble());
			
			cartelera.add(p);
			System.out.println("Desea agregar otra pelicula?");
			opcion = sc.next().toUpperCase().charAt(0);
		}while(opcion == 'S');
		
		return cartelera;
	}
	
	public ArrayList<Pelicula> mostrarCartelera(){
		return this.cartelera;
	}

	public ArrayList<Pelicula> mayorUnaHora(){
		ArrayList<Pelicula> mayores = new ArrayList<>();
		
		for(Pelicula p : cartelera) {
			if(p.getDuracion() > 1) {
				mayores.add(p);
			}
		}
		
		return mayores;
	}
}
