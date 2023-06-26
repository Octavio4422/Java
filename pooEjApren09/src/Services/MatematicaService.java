package Services;

import Entidades.Matematica;

public class MatematicaService {
	public Matematica createMatematica() {
		Matematica operacion = new Matematica(Math.random() * 201 - 100,Math.random() * 201 - 100);
	
		System.out.println("el primer numero tiene un valor de: "+operacion.getNum1());
		
		System.out.println("el segundo numero tiene un valor de: "+operacion.getNum2());
		 		
		return operacion;
	}
	
	public double devolverMayor(Matematica obj) {
		
		if(obj.getNum1() > obj.getNum2()) return obj.getNum1();
		else if(obj.getNum2() > obj.getNum1()) return obj.getNum2();
		else return obj.getNum2();
	}
	
	public double devolverMenor(Matematica obj) {
		
		if(obj.getNum1() < obj.getNum2()) return obj.getNum1();
		else if(obj.getNum2() < obj.getNum1()) return obj.getNum2();
		else return obj.getNum2();
	}
	
	public double calcularPotencia(Matematica obj) {
		int mayor = (int) Math.round(devolverMayor(obj));
		int menor = (int) Math.round(devolverMenor(obj));

		return Math.pow(mayor, menor);
	}
	
	public double calculaRaiz(Matematica obj) {
		int menor = (int) Math.round(devolverMenor(obj));
			
		return Math.sqrt(Math.abs(menor));

	}
}
