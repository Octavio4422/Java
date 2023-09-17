package main;

import java.util.ArrayList;

import Services.ScService;
import entities.Building;
import entities.Office;
import entities.SportsCenter;

public class Main {
	public static void main(String[] args) {
		ArrayList<Building> bds = new ArrayList<>();
				
		ScService scs = new ScService();
		SportsCenter sc1 = scs.createSc();
//		SportsCenter sc2 = scs.createSc();
//		
		Office of1 = new Office(5, 5, 5, 10, 10, 30);
//		Office of2 = new Office(6, 6, 6, 13, 13, 5);
//	
		System.out.println(sc1.calculateSurface());
		System.out.println(sc1.calculateVolume());
		System.out.println(sc1.isCeiling());
		
		System.out.println(of1.calculateSurface());
		System.out.println(of1.calculateVolume());
		System.out.println("Entran " + of1.amountOfPeople());

		
	}
}
