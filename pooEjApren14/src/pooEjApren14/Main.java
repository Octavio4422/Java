package pooEjApren14;

import Entidades.Movil;

// Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
//instanciar un objeto Celular y poder cargarlo en nuestro programa.
// Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
//números de un celular. Para ello, puede utilizarse un bucle repetitivo

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movil celularX = new Movil();
		
		celularX.cargarCelular();
		System.out.println(celularX.toString());
	}

}
