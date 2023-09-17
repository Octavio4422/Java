package integrante;
import java.time.LocalDate;
import utilities.Vinculo;

public class Nino extends Integrante {

	public Nino() {}
	
	public Nino(int nDeOrden, String apellido, String nombre, LocalDate fechaDeNacimiento, int dni, String sexo,
			Vinculo vinculo, ProblemaDeSalud problemaDeSalud, AbordajeNutricional abordajeNutricional) {
		super(nDeOrden, apellido, nombre, fechaDeNacimiento, dni, sexo, vinculo, problemaDeSalud, abordajeNutricional);
		// TODO Auto-generated constructor stub
	}
	
}
