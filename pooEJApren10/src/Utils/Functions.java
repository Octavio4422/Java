package Utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Functions {
	public void rellenar (double[] arr) {
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = Math.random() * 10;
		}
	}
	
	public void mostrar (double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) System.out.print("[ " + arr[i] + " , ");
			else if(i == arr.length -1) System.out.print(arr[i]+ " ]");
			else System.out.print(arr[i] + " , ");
		}
		System.out.println("");
	}
	
	public void ordenar(double[] arr) {
		Arrays.sort(arr);
		//Usar SORT
		/*
		 * for(int i = 0; i< arr.length -1 ; i++) { for(int j = 0; j < arr.length; j++){
		 * if(arr[j] > arr[i]) { double aux = arr[j]; arr[j] = arr[i]; arr[i] = aux; } }
		 * }
		 */
	}
	
	public void rellenarB (double[] arrA, double[] arrB) {
		for(int i = 0; i < arrB.length; i++) {
			if (i < 10) arrB[i] = arrA[i];
			else arrB[i] = 0.5;
		}
	}
}
