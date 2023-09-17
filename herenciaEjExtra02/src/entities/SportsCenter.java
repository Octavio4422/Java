package entities;

public class SportsCenter extends Building {
	private String name;
	private boolean ceiling;

	public SportsCenter() {}
	
	public SportsCenter(double widht, double high, double lng, String name, boolean ceiling) {
		super(widht, high, lng);
		this.name = name;
		this.ceiling = ceiling;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCeiling() {
		return ceiling;
	}

	public void setCeiling(boolean ceiling) {
		this.ceiling = ceiling;
	}

	@Override
	public double calculateSurface() {
		return getWidht()* getLng();
	}

	@Override
	public double calculateVolume() {
		return (getWidht()* getLng()) * getHigh();
	}

}