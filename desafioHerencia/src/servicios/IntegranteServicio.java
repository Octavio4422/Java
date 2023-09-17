package servicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import integrante.AbordajeNutricional;
import integrante.Adulto;
import integrante.AdultoMayor;
import integrante.Integrante;
import integrante.Joven;
import integrante.Nino;
import integrante.ProblemaDeSalud;
import utilities.Vinculo;

public class IntegranteServicio {
	
	public Integrante crearIntegrante() {
		System.out.println("Igrese su numero de orden");
		int ndo = 1;
		System.out.println("Ingee apellido");
		String apellido = "gomez";
		System.out.println("nombre");
		String nombre = "Juan";
		System.out.println("fecha de nacimiento");
		LocalDate fecha = LocalDate.of(2007,6,11);
		System.out.println("dni");
		int dni= 12345678;
		System.out.println("sexo");
		String sexo = "x";
		System.out.println("vinculo");
		Vinculo vinculo = Vinculo.PADRE;
		System.out.println("problema de salud");
		ProblemaDeSalud pds = null;
		System.out.println("abordaje nutricional?");
		AbordajeNutricional an = null;

		int edad = (int) ChronoUnit.YEARS.between(fecha,LocalDate.now());
				
		if(edad >= 0 && edad <=14) {
			Nino n = new Nino(ndo,apellido,nombre, fecha,dni,sexo,vinculo,pds,an);
			return crearNiño(n);
		} else if(edad >=15 && edad <=18) {
			Joven j = new Joven(ndo,apellido,nombre, fecha,dni,sexo,vinculo,pds,an);
			return crearJoven(j);			
		} else if(edad >=19 && edad <=60) {
			Adulto a = new Adulto(ndo,apellido,nombre, fecha,dni,sexo,vinculo,pds,an);
			return crearAdulto(a);
		} else if(edad > 60) {
			AdultoMayor am = new AdultoMayor(ndo,apellido,nombre, fecha,dni,sexo,vinculo,pds,an);
			return crearAdultoMayor(am);
		} else {
			System.out.println("?????");
			return null;
		}
				
	}
	
	private Nino crearNiño(Nino n) {
		return n;
	}

	private Joven crearJoven(Joven j) {
		System.out.println("Que estudia?");
		System.out.println("Hace deporte?");
		System.out.println("Trabaja?");
		j.setEstudio("Vagancia");
		j.setDeporte(true);
		j.setTrabajo(false);
		
		return j;
	}
	
	private Adulto crearAdulto(Adulto a) {
		System.out.println("estudia?");
		System.out.println("Hace deporte?");
		System.out.println("Trabaja?");
		System.out.println("Tiene obra social?");
		
		a.setEstudio(false);
		a.setDeporte(false);
		a.setTrabajo(true);
		a.setObraSocial(true);
		return a;
	}
	
	private AdultoMayor crearAdultoMayor(AdultoMayor am) {
		System.out.println("Tiene obra social?");
		am.setJubilacion(true);
		
		return am;
	}
}
