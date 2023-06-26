package pooEjApren01;

import java.util.Scanner;

import Entidad.Libro;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Libro principito = new Libro();

		principito.setIsbn(sc.nextInt());
		principito.setAutor(sc.next());
		principito.setTitulo(sc.next());

		System.out.println(principito.getIsbn());
		System.out.println(principito.getAutor());
		System.out.println(principito.getTitulo());

	}
}
