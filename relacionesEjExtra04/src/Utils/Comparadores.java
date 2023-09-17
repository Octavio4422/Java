package Utils;
import java.util.Comparator;

import Entidades.Alumno;

public class Comparadores {
	public static Comparator<Alumno> ordenarMayor = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t1, Alumno t2) {

            return t2.getDni().compareTo(t1.getDni());
        }
    };
    
	public static Comparator<Alumno> ordenarVotoMax = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t1, Alumno t2) {
            return t2.getCantidadDeVotos().compareTo(t1.getCantidadDeVotos());
        }
    };
}
