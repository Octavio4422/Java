package Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.

public class PerroService {
	Scanner sc = new Scanner(System.in);
	private ArrayList<String> listaPerritos = new ArrayList<>();
	
	
	public ArrayList<String> getListaPerritos() {
		return listaPerritos;
	}

	@Override
	public String toString() {
		return "PerroService [listaPerritos=" + listaPerritos + "]";
	}


	public void setListaPerritos(ArrayList<String> listaPerritos) {
		this.listaPerritos = listaPerritos;
	}


	public ArrayList<String> agregarRaza() {
		char opcion;
		do {
			System.out.println("Ingrese una raza de perro");
			listaPerritos.add(sc.next());
			
			System.out.println("Desea agregar otro? Ingrese S para si o N para no");
			opcion = sc.next().toUpperCase().charAt(0);

		}while(opcion == 'S');
		
		System.out.print(listaPerritos);
		System.out.print("");
		return listaPerritos;
	}
	
	public ArrayList<String> eliminarRaza(String r) {
		
		boolean check =false;
		
		for(String p: listaPerritos) {
			if(p.equals(r)) {
                check = true;
				listaPerritos.remove(p);
				System.out.println("La raza fue eliminada correctamente");
				break;
			}
		};
		
        Collections.sort(listaPerritos);
        
        if(!check)System.out.println("No existe la Raza");
                
    	System.out.print(listaPerritos);
        		
		return listaPerritos;
	}
}
