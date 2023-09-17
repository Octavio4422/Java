package entities;

public abstract class NonHotel extends Lodge {

	protected boolean isPrivate;
	protected int area;
		
	public NonHotel() {}

	public NonHotel(String name, String direccion, String town, String manager, boolean isPrivate, int area) {
		super(name, direccion, town, manager);
		this.isPrivate = isPrivate;
		this.area = area;
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
}
