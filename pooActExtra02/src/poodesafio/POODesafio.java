package poodesafio;

import Entidad.Pelicula;
import Entidad.Alquiler;
import Servicio.ServicioPelicula;
import Servicio.ServicioAlquiler;
import java.util.Arrays;

public class POODesafio {

    public static void main(String[] args) {
        
        Pelicula[] listadoPeliculas = new Pelicula[5];
        Alquiler[] listadoAlquileres = new Alquiler[3];
        ServicioPelicula sP = new ServicioPelicula();
        ServicioAlquiler sA = new ServicioAlquiler();
        
        //Despues modificar esto haciendo un for y usando el servicio de Peliculas
        //ESTO CARGA PELICULAS
        listadoPeliculas[0] = new Pelicula("SAW1","Terror", 1990,135);
        listadoPeliculas[1] = new Pelicula("SAW2","Terror", 1995,120);
        listadoPeliculas[2] = new Pelicula("SAW3","Terror", 2000,140);
        listadoPeliculas[3] = new Pelicula("SAW4","Terror", 2005,110);
        listadoPeliculas[4] = new Pelicula("SAW5","Terror", 2010,123);
        
        //ESTO LE DA A ELEJIR AL USUARIO QUE PELICULA QUIERE ALQUILAR
        for (int i = 0; i < listadoAlquileres.length; i++) {
            System.out.println("Ingrese un alquiler (" + (i+1) + "/3)");
            listadoAlquileres[i] = sA.crearAlquiler(listadoPeliculas);
        }
    }
}
