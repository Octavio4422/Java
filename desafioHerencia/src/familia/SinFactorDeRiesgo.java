package familia;

public class SinFactorDeRiesgo extends Familia {

	private boolean mejora;
	
	public SinFactorDeRiesgo() {}
		
	public SinFactorDeRiesgo(String direccion, int ide, int nDeLote, String barrio, String localidad,
			InformacionVivienda info) {
		super(direccion, ide, nDeLote, barrio, localidad, info);
		// TODO Auto-generated constructor stub
	}

	public SinFactorDeRiesgo(String direccion, int ide, int nDeLote, String barrio, String localidad,
			InformacionVivienda info, boolean mejora) {
		super(direccion, ide, nDeLote, barrio, localidad, info);
		this.mejora = mejora;
	}

	public boolean isMejora() {
		return mejora;
	}

	public void setMejora(boolean mejora) {
		this.mejora = mejora;
	}

	@Override
	public String toString() {
		return "SinFactorDeRiesgo [mejora=" + mejora + "]";
	}
		
}
