package entidades;

public class Bota {
	private int consumo = 1;
	
	public Bota() {}

	public Bota(int consumo) {
		this.consumo = consumo;
	}

	
	public int getConsumo() {
		return consumo;
	}

	
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
		
	public int caminar(int tiempo) {
		return this.consumo * tiempo;
	}

	public void correr(int tiempo) {
		this.energia -= (botas.getConsumo() * 2) * tiempo;
	}

	public void propulsar(int tiempo) {
		this.energia -= (botas.getConsumo() * 3) * tiempo;
	}

	public void volar(int tiempo) {
		this.energia -= ((botas.getConsumo() * 3) + (guantes.getConsumo() * 2)) * tiempo;
	}
	
}
