package Entidades;

public class RevolverDeAgua {
	private int posicionActual;
	private int posicionAgua;

	public RevolverDeAgua() {}

	public RevolverDeAgua(int posicionActual, int posicionAgua) {
		this.posicionActual = posicionActual;
		this.posicionAgua = posicionAgua;
	}

	public int getPosicionActual() {
		return posicionActual;
	}

	public void setPosicionActual(int posicionActual) {
		this.posicionActual = posicionActual;
	}

	public int getPosicionAgua() {
		return posicionAgua;
	}

	public void setPosicionAgua(int posicionAgua) {
		this.posicionAgua = posicionAgua;
	}
	
	public void llenarRevolver() {
		setPosicionActual((int) (1 +(Math.random() * 6)));
		setPosicionAgua((int) (1 +(Math.random() * 6)));
		System.out.println("El arma fue cargada con exito");
	}
	
	public boolean mojar() {
		if(getPosicionActual() == getPosicionAgua()) return true;
		else return false;
	}
	
	public void siguienteChorro() {
		if(getPosicionActual() + 1 == 7) {
			setPosicionActual(1);
		} else {
			setPosicionActual(getPosicionActual() + 1);
		}
	}

	@Override
	public String toString() {
		return "RevolverDeAgua [posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + "]";
	}
}
