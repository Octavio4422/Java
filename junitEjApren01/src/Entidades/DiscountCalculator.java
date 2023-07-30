package Entidades;

public class DiscountCalculator {
	public double descuento(double p, double d) {
		return p - (d/100 * p);
	}
}
