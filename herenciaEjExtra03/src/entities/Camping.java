package entities;

public final class Camping extends NonHotel {

	private int nOftents;
	private int nOfBathrooms;
	private boolean restaurant;
	
	public Camping() {}

	public Camping(String name, String direccion, String town, String manager, boolean isPrivate, int area,
			int nOftents, int nOfBathrooms, boolean restaurant) {
		super(name, direccion, town, manager, isPrivate, area);
		this.nOftents = nOftents;
		this.nOfBathrooms = nOfBathrooms;
		this.restaurant = restaurant;
	}

	public int getnOftents() {
		return nOftents;
	}

	public void setnOftents(int nOftents) {
		this.nOftents = nOftents;
	}

	public int getnOfBathrooms() {
		return nOfBathrooms;
	}

	public void setnOfBathrooms(int nOfBathrooms) {
		this.nOfBathrooms = nOfBathrooms;
	}

	public boolean isRestaurant() {
		return restaurant;
	}

	public void setRestaurant(boolean restaurant) {
		this.restaurant = restaurant;
	}
	
}
