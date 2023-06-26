package Services;

import Entidades.Vehiculo;
import java.util.Scanner;

public class VehiculoService {
	public Vehiculo crearVehiculo() {
		String t;
		
		Vehiculo newVehiculo = new Vehiculo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la marca del vehiculo");
		newVehiculo.setMarca(sc.next());
		
		System.out.println("Ingrese el modelo del vehiculo");
		newVehiculo.setModelo(sc.next());
		
		System.out.println("Ingrese el año de lanzamiento del vehiculo");
		newVehiculo.setAnio(sc.nextInt());
		
		System.out.println("Ingrese el tipo de vehiculo");
		
		//arregla el bug
		t = sc.next();
		while(!t.equalsIgnoreCase("auto") && !t.equalsIgnoreCase("moto") && !t.equalsIgnoreCase("Bicicleta")) {
			System.out.println("Ingrese uno valido");
			t = sc.next();
		}
		
		newVehiculo.setTipo(t);
		return newVehiculo;
	}

}
