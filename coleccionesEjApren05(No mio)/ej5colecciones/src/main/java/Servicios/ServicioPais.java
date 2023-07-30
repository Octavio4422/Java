/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Pais;
import Entidades.PaisComparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class ServicioPais {

    Scanner leer = new Scanner(System.in);
    TreeSet<Pais> listaPaises = new TreeSet<>(PaisComparator.alfabetico);

    public TreeSet<Pais> agregarPais() {
        String op;
        do {
            Pais p = new Pais();
            System.out.println("Ingrese un pais");
            p.setNombre(leer.next());
            listaPaises.add(p);
            System.out.println(listaPaises);
            System.out.println("Desea ingresar otro pais? S/N");
            op = leer.next();

        } while (op.equalsIgnoreCase("s"));
        return listaPaises;
    }
    
    // Collections.sort(listaPaises, PaisComparator.alfabetico);

    public TreeSet<Pais> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(TreeSet<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }
    
    

    
    
}
