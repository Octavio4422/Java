package Main;

import Servicio.HabitacionService;
import Servicio.PersonaService;
import Servicio.ReservaService;

//Un hotel está alquilando habitaciones, y en esta temporada decidió realizar las reservas desde internet. el
//hotel cuenta con 10 Habitaciones, de las cuales:


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HabitacionService hs = new HabitacionService();
		PersonaService ps = new PersonaService();
		ReservaService rs = new ReservaService();
		
		hs.definirCapacidad();
		
		System.out.println("Ya tenes un usuario o te queres registrar");
		
		
		//ps.registrarPersonas();
		rs.crearReserva();
		//menu();
		
	}

	public static void menu() {
		System.out.println("Bienvenido a trivago");
		System.out.println("1.Hacer una reserva");
		System.out.println("2.Ver mis reservas");
		System.out.println("3.Modificar una reserva");
		System.out.println("4.Eliminar una reserva");
		
	}
	
}
