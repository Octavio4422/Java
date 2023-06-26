package pooEjApren11;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/*trabajar con la clase Date.
 *  En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int dia, mes, anio;
		System.out.println("Ingrese en orden dd/mm/aa");
		dia = sc.nextInt();
		mes = sc.nextInt();
		anio = sc.nextInt();
		
		LocalDate fecha = LocalDate.of(anio, mes, dia);
		System.out.println("La fecha ingresada es: " + fecha);
		
		LocalDate fechaActual = LocalDate.now();
		System.out.println("La fecha actual es: " + fechaActual);
		
		Period entre = fecha.until(fechaActual);
		System.out.println("La diferencia entre las fechas es de: " + entre.getYears() + " años, " + entre.getMonths() + " meses y " + entre.getDays() + " dias");
	}
}
