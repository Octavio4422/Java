package Entidades;

public class Animal {
	protected String nombre;
	protected String alimento;
	protected int edad;
	protected String raza;
	
	public Animal() {};
	
	public Animal(String nombre, String alimento, int edad, String raza) {
		super();
		this.nombre = nombre;
		this.alimento = alimento;
		this.edad = edad;
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	
	public void Alimentarse() {
		System.out.println("me alimento de " + this.alimento);
	}
	
	@Override	
	public String toString() {
		return "Animal [nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + "]";
	}
	
}
