package Services;

import java.util.Scanner;

import entities.SportsCenter;

public class ScService {
	
	public SportsCenter createSc() {
		Scanner sc = new Scanner(System.in);
		
		SportsCenter sc1 = new SportsCenter();
		
		System.out.println("Ingrese el nombre del establecimiento");
		sc1.setName(sc.next());
		System.out.println("Ingrese S o N si el establecimiento " + sc1.getName() + " es o no techado");
		String op = sc.next().toUpperCase();
		
		while(!op.equals("S") && !op.equals("N")) {
			System.out.println("Opcion incorrecta intente denuevo");
			op = sc.next().toUpperCase();
		}
		
		if(op.equals("S")) {
			sc1.setCeiling(true);
			System.out.println("Ingrese la altura desde el piso al techo del establecimiento");
			sc1.setHigh(sc.nextInt());
		}
		else if(op.equals("N")) {
			sc1.setCeiling(false);
			System.out.println("Ingrese una altura maxima estimada del establecimiento");
			sc1.setHigh(sc.nextInt());
		}
		else System.out.println("Dale pa");
		
		System.out.println("Ingrese el ancho del establecimiento");
		sc1.setWidht(sc.nextInt());
		System.out.println("Ingrese el largo del establecimiento");
		sc1.setLng(sc.nextInt());
		return sc1;
	}
}
