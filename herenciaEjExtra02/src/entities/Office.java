package entities;

public class Office extends Building {

	private int nOfOficce;
	private int nOfFloors;
	private int nOfPeople;
	
	public Office() {}
	
	public Office(double widht, double high, double lng, int nOfOficce, int nOfFloors, int nOfPeople) {
		super(widht, high, lng);
		this.nOfOficce = nOfOficce;
		this.nOfFloors = nOfFloors;
		this.nOfPeople = nOfPeople;
	}

	public int getnOfOficce() {
		return nOfOficce;
	}

	public void setnOfOficce(int nOfOficce) {
		this.nOfOficce = nOfOficce;
	}

	public int getnOfFloors() {
		return nOfFloors;
	}

	public void setnOfFloors(int nOfFloors) {
		this.nOfFloors = nOfFloors;
	}

	public int getnOfPeople() {
		return nOfPeople;
	}

	public void setnOfPeople(int nOfPeople) {
		this.nOfPeople = nOfPeople;
	}
	
	@Override
	public double calculateSurface() {
		return getWidht()* getLng();
	}

	@Override
	public double calculateVolume() {
		return (getWidht()* getLng()) * getHigh();
	}
	
	public int amountOfPeople() {
		return nOfPeople * nOfFloors;
	}
	
	@Override
	public String toString() {
		return "Office [nOfOficce=" + nOfOficce + ", nOfFloors=" + nOfFloors + "]";
	}

}
