/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class PaisComparator {

    public static Comparator<Pais> alfabetico = new Comparator<Pais>() {

        @Override
        public int compare(Pais t1, Pais t2) {
            return (t1.getNombre().compareTo(t2.getNombre()));
        }

    };
}
