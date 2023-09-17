package Entidades;

public final class Perro extends Animal{

	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perro(String nombre, String alimento, int edad, String raza) {
		super(nombre, alimento, edad, raza);
	}
	
	@Override
	public void Alimentarse() {
//		super.Alimentarse();
		System.out.println("Dale boca");
	}
}
