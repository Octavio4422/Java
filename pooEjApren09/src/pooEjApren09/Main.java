package pooEjApren09;
import Services.MatematicaService;
import Entidades.Matematica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatematicaService ms = new MatematicaService();
	
		Matematica operacion = ms.createMatematica();
		
		System.out.println("El numero mayor es " + ms.devolverMayor(operacion));
		System.out.println("La potencia del mayor elevado al menor es: " + ms.calcularPotencia(operacion));
		System.out.println("La raiz cuadrada del numero menor es: " + ms.calculaRaiz(operacion));
	}
}
