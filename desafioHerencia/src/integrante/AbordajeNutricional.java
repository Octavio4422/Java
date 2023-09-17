package integrante;

public class AbordajeNutricional {

	private int nDeOrden;
	private int edad;
	private int peso;
	private boolean euforico;
	private boolean bajoPeso;
	private boolean sobrePeso;
	
	public AbordajeNutricional() {}

	public AbordajeNutricional(int nDeOrden, int edad, int peso, boolean euforico, boolean bajoPeso,
			boolean sobrePeso) {
		this.nDeOrden = nDeOrden;
		this.edad = edad;
		this.peso = peso;
		this.euforico = euforico;
		this.bajoPeso = bajoPeso;
		this.sobrePeso = sobrePeso;
	}

	public int getnDeOrden() {
		return nDeOrden;
	}

	public void setnDeOrden(int nDeOrden) {
		this.nDeOrden = nDeOrden;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean isEuforico() {
		return euforico;
	}

	public void setEuforico(boolean euforico) {
		this.euforico = euforico;
	}

	public boolean isBajoPeso() {
		return bajoPeso;
	}

	public void setBajoPeso(boolean bajoPeso) {
		this.bajoPeso = bajoPeso;
	}

	public boolean isSobrePeso() {
		return sobrePeso;
	}

	public void setSobrePeso(boolean sobrePeso) {
		this.sobrePeso = sobrePeso;
	}

}
