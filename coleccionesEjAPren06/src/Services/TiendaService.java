package Services;

import java.util.HashMap;
import java.util.Scanner;

//introducir un elemento,
//modificar su precio,
//eliminar un producto
//y mostrar los productos que tenemos con su precio
//(Utilizar Hashmap)llave el nombre del producto y valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.

public class TiendaService {
	Scanner sc = new Scanner(System.in);
	
	HashMap<String, Double> gondola = new HashMap<>();
	
	public void crearProducto() {
		System.out.println("Ingrese el nombre del producto");
		String nombre = sc.next();
		
		if(gondola.containsKey(nombre)) {
			System.out.println("El producto ingresado ya existe, desea modificarlo?");
			System.out.println("Ingrese S para si o N para no");
			
			String opc = sc.next();
			
			while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N")) {
				System.out.println("opcion invalida, intente nuevamente");
				opc= sc.next();
			}
			
			if(opc.equalsIgnoreCase("S")) modificarProducto(nombre);
			else System.out.println("Hubo un error a la hora de añadir el producto");
			
		}else {
			System.out.println("Ingrese el valor del producto");
			Double precio = sc.nextDouble();
			
			gondola.put(nombre, precio);
			System.out.println("El producto fue añadido con exito");	
		}
	}
		
	public void eliminarProducto() {
		System.out.println("Ingrese el nombre del producto a eliminar");
		String nombre = sc.next();
		if(gondola.containsKey(nombre)) {
			gondola.remove(nombre);
			System.out.println("El producto fue eliminado con exito");	
		} else {
			System.out.println("El producto no existe o ya fue eliminado");
		}
	}
	
	public void modificarProducto() {
		System.out.println("Ingrese el nombre del producto a modificar");
		String nombre = sc.next();
		if(gondola.containsKey(nombre)) {
			System.out.println("Ingrese el nuevo valor del producto");
			Double precio = sc.nextDouble();
			gondola.put(nombre,precio);
			System.out.println("El producto fue modificado con exito");	
		} else {
			System.out.println("El producto no existe o fue mal ingresado");
		}
	}
	
	public void modificarProducto(String nombre) {
		System.out.println("Ingrese el nuevo valor del producto");
		Double precio = sc.nextDouble();
		gondola.put(nombre,precio);
		System.out.println("El producto fue modificado con exito");	
	}
	
	public void mostarProductos() {
		System.out.println(this.getGondola());
	}

	@Override
	public String toString() {
		return "TiendaService [gondola=" + gondola + "]";
	}

	public HashMap<String, Double> getGondola() {
		return gondola;
	}

}
