package pooEJApren10;
import Utils.Functions;
/*
El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.

Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5.

 Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions Utils = new Functions();
		
		double[] A = new double[20];
		double[] B = new double[20];
	
		Utils.rellenar(A);
		Utils.mostrar(A);

		Utils.ordenar(A);
		Utils.mostrar(A);
		
		Utils.rellenarB(A, B);
		
		Utils.mostrar(B);
	}
}
