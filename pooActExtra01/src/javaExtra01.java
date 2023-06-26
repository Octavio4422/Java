import Entidades.Vehiculo;
import Services.VehiculoService;

public class javaExtra01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehiculoService vs = new VehiculoService();
		
		Vehiculo vehiculoUno = vs.crearVehiculo();
		Vehiculo vehiculoDos = vs.crearVehiculo();
		Vehiculo vehiculoTres = vs.crearVehiculo();
		
		//moviendose 5 segundos
		vehiculoUno.moverse(5);
		vehiculoDos.moverse(5);
		vehiculoTres.moverse(5);
		vehiculoUno.frenar();
		vehiculoDos.frenar();
		vehiculoTres.frenar();
		System.out.println("///////////////////////////////");
		//moviendose 10 segundos
		vehiculoUno.moverse(10);
		vehiculoDos.moverse(10);
		vehiculoTres.moverse(10);
		
		vehiculoUno.frenar();
		vehiculoDos.frenar();
		vehiculoTres.frenar();
		System.out.println("///////////////////////////////");
		//moviendose 60 segundos / 1 minuto
		vehiculoUno.moverse(60);
		vehiculoDos.moverse(60);
		vehiculoTres.moverse(60);
		
		vehiculoUno.frenar();
		vehiculoDos.frenar();
		vehiculoTres.frenar();
		System.out.println("///////////////////////////////");
		vehiculoUno.moverse(300);
		vehiculoDos.moverse(300);
		vehiculoTres.moverse(300);
		
		vehiculoUno.frenar();
		vehiculoDos.frenar();
		vehiculoTres.frenar();
		
	}

}
