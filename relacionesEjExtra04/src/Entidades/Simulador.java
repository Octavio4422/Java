package Entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Simulador {
	Scanner sc = new Scanner(System.in);
	ArrayList<Alumno> alumnos = new ArrayList<>();
	ArrayList<String> nombresCompletos = new ArrayList<>();
	HashSet<Integer> dnis = new HashSet<>();
	
	public ArrayList<String> generarListado(){
		for (int i = 0; i < 10; i++) {
			nombresCompletos.add("" + nombre.values()[(int) (Math.random() * 10)]+ " " + apellido.values()[(int) (Math.random() * 10)] );
		}
		
		return nombresCompletos;
	}
	//public HashSet<Integer> generarDnis(){
//  while(dnis.size() < 10) {
//   dnis.add((int) (Math.random() * (max - min + 1) + min);
//  }
//  return dnis;

//int max = 49999999;
//int min = 10000000;
//int dni = (int) Math.floor(Math.random() *(max -  min+ 1) + min);

//  System.out.println("Ingrese una cantidad de alumnos para crear");
//  int n = sc.nextInt();
//  int aux = 0;
//  
//  for(int dni: dnis) {
//   if(n > aux) {
//    Alumno a = new Alumno(nombresCompletos.get((int) (Math.random() * 10)), dni);
//    alumnos.add(a);
//    aux += 1;
//   } else break;
//  }
// }
		
	public HashSet<Integer> generarDnis(){
		while(dnis.size() < 10) {
			dnis.add((int) (Math.random() * 100));
		}
		return dnis;
	}
	
	public void crearAlumnos() {
		
		System.out.println("Ingrese una cantidad de alumnos para crear");
		int n = sc.nextInt();
		int aux = 0;
		
		for(int dni: dnis) {
			if(n > aux) {
				Alumno a = new Alumno(nombresCompletos.get((int) (Math.random() * 10)), dni);
				alumnos.add(a);
				aux += 1;
			} else break;
		}
	}
	
	public void votacion(ArrayList<Alumno> alumnos) {
		Random random = new Random();
		
		for(Alumno a : alumnos) {
			HashSet<Alumno> votados = new HashSet<>();
//			if(votados.contains())
			while(votados.size() < 3) {
				Alumno x = alumnos.get(random.nextInt(alumnos.size()));
				votados.add(x);
			}

			for(Alumno b : votados) {
				b.setCantidadDeVotos(b.getCantidadDeVotos() + 1);
			}
			
			Voto v = new Voto(a, votados);
			a.setVotos(v);
		}
	}
	
	
	////////////////////////////////////////////////////
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public String toString() {
		return "Simulador [nombresCompletos=" + nombresCompletos + "]\n";
	}
	
}
