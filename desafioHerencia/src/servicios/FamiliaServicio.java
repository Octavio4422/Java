package servicios;

import java.util.ArrayList;
import java.util.Scanner;
import familia.FactorDeRiesgo;
import familia.Familia;
import familia.InformacionVivienda;
import familia.SinFactorDeRiesgo;
import integrante.Integrante;
import utilities.Paredes;
import utilities.Piso;

public class FamiliaServicio {
	public Familia crearFamilia(int id) {
		Scanner sc = new Scanner(System.in);
		IVServicio ivs = new IVServicio();
		id += 1;
		
		System.out.println("Se le asignara el id " + id  +" a la familia en creacion");
		int ide = id;
		System.out.println("Ingrese la direccion");
		String direc = sc.next();
		System.out.println("Ingrese el lote");
		int lote = sc.nextInt();
		System.out.println("Ingrese el barrio");
		String barrio = sc.next();
		System.out.println("Ingrese la Localidad");
		String local = sc.next();
		System.out.println("Ingrese la informacion de la vivienda");
		InformacionVivienda iv = ivs.crearInformacion();
		System.out.println("Ingrese 1 si tiene factor de riezgo, ingrese 2 si cuenta con alguna mejora");
		int opc = sc.nextInt();
		
		switch (opc) {
		case 1: {
			return crearFDR(ide, direc, lote, barrio, local, iv);
		}
		case 2: {
			return crearSFDR(ide, direc, lote, barrio, local, iv);
		}
		default:
			throw new IllegalArgumentException("Unexpected value");
		}

	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private Familia crearFDR(int ide, String direc, int lote, String barrio, String local, InformacionVivienda iv) {
		System.out.println("Que factor de riezgo tiene?");
		ArrayList<Integer> factores = elegirFactores();
		FactorDeRiesgo fdr = new FactorDeRiesgo(direc, ide, lote, barrio, local, iv, factores);
		return fdr;
	}

	private Familia crearSFDR(int ide, String direc, int lote, String barrio, String local, InformacionVivienda iv) {
		System.out.println("Tiene alguna mejora?");
		boolean mejora = true;
		SinFactorDeRiesgo sfr = new SinFactorDeRiesgo(direc,ide, lote, barrio,local, iv, true);
		return sfr;
	}

	public Integrante agregarIntegrante(Familia fa) {
		//Hacer las validaciones necesarias con el objeto completo
		
		IntegranteServicio is = new IntegranteServicio();
		Integrante i = is.crearIntegrante();
		
		
		return i;
	}
	
	private ArrayList<Integer> elegirFactores(){
		ArrayList<Integer> a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		
		return a;
	}

}
