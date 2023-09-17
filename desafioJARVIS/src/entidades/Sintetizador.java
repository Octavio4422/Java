package entidades;

public class Sintetizador {
	private int consumo = 3;
	
	public Sintetizador() {}

	public Sintetizador(int consumo) {
		this.consumo = consumo;
	}
	
	public int getConsumo() {
		return consumo;
	}
	
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
}
