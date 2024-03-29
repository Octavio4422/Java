package Entidades;

public class Jugador {
	private int id;
	private String nombre;
	private boolean mojado;

	public Jugador() {}

	public Jugador(int id, String nombre, boolean mojado) {
		this.id = id;
		this.nombre = nombre;
		this.mojado = mojado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isMojado() {
		return mojado;
	}

	public void setMojado(boolean mojado) {
		this.mojado = mojado;
	}
	
	public void disparo(RevolverDeAgua r) {
		if(r.mojar()) {
			setMojado(true);
			System.out.println("Te mojaste "+ this.nombre +  " sos un boludo");
		}
		else r.siguienteChorro(); 
	}
	
	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + "]";
	}
}
