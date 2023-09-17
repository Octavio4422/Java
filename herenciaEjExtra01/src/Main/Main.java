package Main;

import java.time.LocalDate;

import entities.MotorBoat;
import entities.Rent;
import entities.Ship;

public class Main {
	public static void main(String[] args) {
		Ship s1 = new Ship("aaaaa", 30, LocalDate.of(2006,06,16));
		MotorBoat mb1 = new MotorBoat("aaaaa", 30, LocalDate.of(2006,06,16), 300);
		
		Rent r1 = new Rent("octavio", 222222, LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 5), 1, s1);
		Rent r2 = new Rent("octavio", 222222, LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 5), 1, mb1);
		System.out.println(r2.rent());
	
	}
}
