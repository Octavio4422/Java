package entidades;

public class Armadura {
	private String colorP;
	private String colorS;
	private int salud;
	private int dureza;
	private int energia = 100;
	private Bota botas;
	private Guante guantes;
	private Consola consola;
	private Sintetizador sintetizador;

	public Armadura() {
	}

	public Armadura(String colorP, String colorS, int salud, int dureza, Bota botas, Guante guantes, Consola consola,
			Sintetizador sintetizador) {
		this.colorP = colorP;
		this.colorS = colorS;
		this.salud = salud;
		this.dureza = dureza;
		this.botas = botas;
		this.guantes = guantes;
		this.consola = consola;
		this.sintetizador = sintetizador;
	}

	public String getColorP() {
		return colorP;
	}

	public void setColorP(String colorP) {
		this.colorP = colorP;
	}

	public String getColorS() {
		return colorS;
	}

	public void setColorS(String colorS) {
		this.colorS = colorS;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getDureza() {
		return dureza;
	}

	public void setDureza(int dureza) {
		this.dureza = dureza;
	}

	public Bota getBotas() {
		return botas;
	}

	public void setBotas(Bota botas) {
		this.botas = botas;
	}

	public Guante getGuantes() {
		return guantes;
	}

	public void setGuantes(Guante guantes) {
		this.guantes = guantes;
	}

	public Consola getConsola() {
		return consola;
	}

	public void setConsola(Consola consola) {
		this.consola = consola;
	}

	public Sintetizador getSintetizador() {
		return sintetizador;
	}

	public void setSintetizador(Sintetizador sintetizador) {
		this.sintetizador = sintetizador;
	}

	/////////////////////////////////////////////////////////

	public void caminar(int tiempo) {
		this.energia -= botas.getConsumo() * tiempo;
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

	public void escribir(int opcion) {
		switch (opcion) {
		case 1: {
			System.out.println("Hablaste por sintetizador");
			this.energia -= consola.getConsumo();
			break;
		}
		case 2: {
			System.out.println("Hablaste por consola");
			this.energia -= sintetizador.getConsumo();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
	}

	public void leer() {
		System.out.println("leido");
	}
}
