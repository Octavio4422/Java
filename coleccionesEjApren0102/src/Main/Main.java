package Main;
import Services.PerroService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerroService ps = new PerroService();
		
		ps.agregarRaza();
		ps.eliminarRaza("perro");
		
	}

}
