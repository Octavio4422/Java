package Entidades;

import java.util.ArrayList;

public class Tienda {
	public boolean venta(ArrayList<Producto> gondola, String compra) {
		
		boolean hay = false;
		
		for(Producto p : gondola) {
			if(p.getNombre().equalsIgnoreCase(compra)) {
				hay = true;
				if(p.getStock() > 0) {
					p.setStock(p.getStock() - 1);
					System.out.println("Disfruta de tu " + p.getNombre());
				} else {
					System.out.println("No hay stock de " + p.getNombre());
				}
			}

		}
		
		if(!hay) {
			System.out.println("No se encontro el producto solicitado");
			return false;
		} else return true;
		
	}
	
	public void reposicion(ArrayList<Producto> gondola, String producto, int cantidad) {
		
		boolean hay = false;
		
		for(Producto p : gondola) {
			if(p.getNombre().equalsIgnoreCase(producto)) {
					p.setStock(p.getStock() + cantidad);
					System.out.println("Ahora" + p.getNombre() + " tiene " + p.getStock() + " unidades");
			}
		}
		
		if(!hay) {
			System.out.println("No se encontro el producto solicitado");
		}
	}
}
