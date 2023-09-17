package Servicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import Entidades.Habitacion;

public class HabitacionService {
	HashMap<Integer,ArrayList<Habitacion>> capacidadHabitaciones = new HashMap<>();
		
	public void definirCapacidad(){
		ArrayList<Habitacion> dosPersonas = new ArrayList<>(Arrays.asList(new Habitacion(1),new Habitacion(2),new Habitacion(3),new Habitacion(4),new Habitacion(5)));
		ArrayList<Habitacion> tresPersonas = new ArrayList<>(List.of(new Habitacion(6),new Habitacion(7),new Habitacion(8)));
		ArrayList<Habitacion> unaPersonas = new ArrayList<>(List.of(new Habitacion(9),new Habitacion(10)));
		
		capacidadHabitaciones.put(2,dosPersonas);
		capacidadHabitaciones.put(3,tresPersonas);
		capacidadHabitaciones.put(1,unaPersonas);
	}

	public HashMap<Integer, ArrayList<Habitacion>> getCapacidadHabitaciones() {
		return capacidadHabitaciones;
	}

}
