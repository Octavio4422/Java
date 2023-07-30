package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		Iterator<Integer> it = numeros.iterator();
		
		int suma = 0;
		
		do {
			System.out.println("ingrese un numero");
			int num = scan.nextInt();
			
			if(num != -99) {
				numeros.add(num);
				suma += num;
			} else {
				break;
			}
		}while(true);

		System.out.println("Se han leido un total de " + numeros.size() + " numeros");
		System.out.println("La suma total de los numeros es de " + suma);
		System.out.println("El promedio de los numeros ingresados es de: " + suma/numeros.size());
	}

}
