package DesafioPoo;

import Entidades.Cliente;
import Entidades.Rutina;
import Servicios.ClienteService;
import Servicios.RutinaService;

public class Main {
	public static void main(String[] args) {

		ClienteService cs = new ClienteService();
		RutinaService rs = new RutinaService();
		Cliente clienteUno = cs.registrarCliente();
		Cliente clienteDos = cs.registrarCliente();
		
		System.out.println(cs.obtenerClientes());
	
		cs.actualizarCliente(1, "Octu", 12, 1.60, 50, "crecer");
		
		System.out.println(cs.obtenerClientes());
	}

}
