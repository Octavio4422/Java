package Entidad;

public class Circunferencia {
	private double radio;
	
	public Circunferencia() {}
	
	public Circunferencia(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void crearCircunferencia(double radio) {
		setRadio(radio);
	}
	
	public double area() {
		return 3.14 * Math.pow(this.radio, 2);
	}
	
	public double perimetro() {
		return 2 * radio * 3.14;
	}
	
}
