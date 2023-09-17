package servicios;

import java.util.Scanner;
import familia.InformacionVivienda;
import utilities.Paredes;
import utilities.Piso;

public class IVServicio {
	
	public InformacionVivienda crearInformacion() {
		Scanner sc = new Scanner(System.in);
		InformacionVivienda iv = new InformacionVivienda();
		
		System.out.println("Cuantos dormitorios tiene la vivienda?");
		int dorm = sc.nextInt();
//		System.out.println("Que tipo de paredes?");
		Paredes pa = Paredes.MATERIAL;
//		System.out.println("Que tipo de piso?");
		Piso pi = Piso.MOSAICO;
//		System.out.println("Tiene iluminacion?");
		boolean iluminacion = true;
		
		iv.setnDeDormitorios(dorm);
		iv.setTipoDeParedes(pa);
		iv.setTipoDePiso(pi);
		iv.setIluminacion(iluminacion);
		
		return iv;
	}
	
}
