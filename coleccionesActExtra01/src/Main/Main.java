package Main;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Producto;
import Entidades.Tienda;
import Servicios.ProductoService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ProductoService ps = new ProductoService(); 
		Tienda t = new Tienda();
		
		ArrayList<Producto> productos = new ArrayList<>();
			
		char opcion;
		
		do {
			productos.add(ps.crearProducto());
			
			System.out.println("Desea agregar otro producto? ingrese s o n");
			opcion = sc.next().toUpperCase().charAt(0);
		} while(opcion == 'S');

		
		t.venta(productos, "cocacola");
		
	}
}
