package familia;

import java.util.ArrayList;

public class FactorDeRiesgo extends Familia{

	private ArrayList<Integer> factores;
	
	public FactorDeRiesgo() {}

	public FactorDeRiesgo(String direccion, int ide, int nDeLote, String barrio, String localidad,
			InformacionVivienda info, ArrayList<Integer> factores) {
		super(direccion, ide, nDeLote, barrio, localidad, info);
		this.factores = factores;
	}

	public ArrayList<Integer> getFactores() {
		return factores;
	}

	public void setFactores(ArrayList<Integer> factores) {
		this.factores = factores;
	}

	@Override
	public String toString() {
		return "FactorDeRiesgo [factores=" + factores + "]";
	}

}
