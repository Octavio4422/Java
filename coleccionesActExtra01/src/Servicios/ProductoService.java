package Servicios;

import java.util.Scanner;

import Entidades.Producto;

public class ProductoService {
	
	Scanner sc = new Scanner(System.in);
	
	public Producto crearProducto() {
		Producto p = new Producto();
		
		System.out.println("Ingrese el nombre del producto");
		p.setNombre(sc.next());
		System.out.println("Ingrese la categoria del producto");
		p.setCategoria(sc.next());
		System.out.println("Ingrese el precio del producto");
		p.setPrecio(sc.nextDouble());
		System.out.println("Ingrese el stock del producto");
		p.setStock(sc.nextInt());
		
		return p;
	}
}
