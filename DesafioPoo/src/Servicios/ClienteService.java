package Servicios;

import java.util.ArrayList;
import java.util.Scanner;
import Entidades.Cliente;

public class ClienteService {
	private ArrayList<Cliente> listaClientes = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	public Cliente registrarCliente() {
		Cliente c = new Cliente();

		if(listaClientes.size() == 0) {
			c.setId(1);
		} else {
			c.setId(listaClientes.size() + 1);
		}

		System.out.println("Ingrese su Nombre");
		c.setNombre(sc.next());
		System.out.println("Ingrese su edad");
		c.setEdad(sc.nextInt());
		System.out.println("Ingrese su altura en centimetros");
		c.setAltura(sc.nextDouble());
		System.out.println("Ingrese su peso");
		c.setPeso(sc.nextDouble());
		System.out.println("Ingrese su objetivo");
		c.setObjetivo(sc.next());

		listaClientes.add(c);
		return c;
	}

	public ArrayList<Cliente> obtenerClientes() {
		return this.listaClientes;
	}

	public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
		
		listaClientes.forEach(cliente -> {
			if (cliente.getId() == id) {
				cliente.setNombre(nombre);
				cliente.setEdad(edad);
				cliente.setAltura(altura);
				cliente.setPeso(peso);
				cliente.setObjetivo(objetivo);

				System.out.println("Se actualizo el cliente");
			}
		});
		
		
	}

	public void eliminarCliente(int id) {
		int i = 0;
		if (this.listaClientes.size() > 0) {
			for (Cliente c : listaClientes) {
				if (c.getId() == id) {
					i = listaClientes.indexOf(c);
				}
			}

			listaClientes.remove(i);
		} else {
			System.out.println("no hay nada para eliminar bro");
		}

	}

}
