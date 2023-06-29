package Servicio;

import Entidad.Alquiler;
import Entidad.Pelicula;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ServicioAlquiler {
    Scanner scan = new Scanner(System.in);
    
    public Alquiler crearAlquiler(Pelicula[] listadoPeliculas){
        Alquiler a = new Alquiler();
        LocalDate fechaActual = LocalDate.now();
        
        //MUESTRA EL LISTADO DE PELICULAS
        System.out.println("ESTAS SON LAS PELICULAS DISPONIBLES PARA ALQUILAR:");
        for (int i = 0; i < listadoPeliculas.length; i++) {
            System.out.println((i+1)+ ".  " + listadoPeliculas[i].getTitulo());
        }
        
        //agregar validacion de rango de numero
        //LE PIDE AL USUARIO LA PELICULA CORRESPONDIENTE
        System.out.println("SELECCIONE EL NUMERO CORRESPONDIENTE A LA PELICULA DESEADA");
        int opcion = scan.nextInt();
        a.setPeliculaAlquilada(listadoPeliculas[opcion - 1].getTitulo());
        
        //despues sumar una validacion para las fechas
        System.out.println("Ingrese el dia del alquiler: ");
        int dia = scan.nextInt();
        System.out.println("Ingrese el mes del alquiler: ");
        int mes = scan.nextInt();
        
        a.setFechaInicio(LocalDate.of(2023, mes, dia));
        a.setFechaFin(fechaActual);
        
        //Guarda un precio segun el tipo de pelicula y la cantidad de dias alquilada
        switch (listadoPeliculas[opcion].getGenero()) {
            case "Terror":
            	Period precio = a.getFechaInicio().until(fechaActual);
            	a.setPrecio(precio.getDays() * 300);
                break;
            default:
                System.out.println("ERROR EN SERVICIO ALQUILER");
        	}
        return a;
    }
}
