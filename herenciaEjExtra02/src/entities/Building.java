package entities;

public abstract class Building {

	protected double widht;
	protected double high;
	protected double lng;
	
	public Building() {}

	public Building(double widht, double high, double lng) {
		this.widht = widht;
		this.high = high;
		this.lng = lng;
	}

	
	public double getWidht() {
		return widht;
	}

	public void setWidht(double widht) {
		this.widht = widht;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	
	protected abstract double calculateSurface();
	protected abstract double calculateVolume();
	
	@Override
	public String toString() {
		return "Building [widht=" + widht + ", high=" + high + ", lng=" + lng + "]";
	}

}
