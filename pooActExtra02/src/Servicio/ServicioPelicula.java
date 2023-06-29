package Servicio;

import Entidad.Pelicula;
import java.util.Scanner;

public class ServicioPelicula {
    
    Scanner scan = new Scanner(System.in);
    
    public Pelicula crearPelicula(){
        Pelicula p = new Pelicula();
        
        System.out.println("Ingrese el titulo: ");
        p.setTitulo(scan.nextLine());
        
        System.out.println("Ingrese el genero: ");
        p.setGenero(scan.nextLine());
        
        System.out.println("Ingrese el anio: ");
        p.setAnio(scan.nextInt());
        
        System.out.println("Ingrese la duracion en minutos: ");
        p.setDuracion(scan.nextInt());
        
        return p;
    }
   
}
