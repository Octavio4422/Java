package entidades;

public class Consola {
	private int consumo = 1;
	
	public Consola() {}

	public Consola(int consumo) {
		this.consumo = consumo;
	}
	
	public int getConsumo() {
		return consumo;
	}
	
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
}
