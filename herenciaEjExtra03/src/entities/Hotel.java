package entities;

public abstract class Hotel extends Lodge {
	
	protected int nOfRooms;
	protected int nOfBeds;
	protected int nOfFloors;
	protected double roomPrice;
	
	public Hotel() {}
	
	public Hotel(String name, String direccion, String town, String manager, int nOfRooms, int nOfBeds, int nOfFloors,
			double roomPrice) {
		super(name, direccion, town, manager);
		this.nOfRooms = nOfRooms;
		this.nOfBeds = nOfBeds;
		this.nOfFloors = nOfFloors;
		this.roomPrice = roomPrice;
	}

	public int getnOfRooms() {
		return nOfRooms;
	}

	public void setnOfRooms(int nOfRooms) {
		this.nOfRooms = nOfRooms;
	}

	public int getnOfBeds() {
		return nOfBeds;
	}

	public void setnOfBeds(int nOfBeds) {
		this.nOfBeds = nOfBeds;
	}

	public int getnOfFloors() {
		return nOfFloors;
	}

	public void setnOfFloors(int nOfFloors) {
		this.nOfFloors = nOfFloors;
	}

	public double getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}
	
	public int hotelCapacity() {
		return (getnOfBeds() * getnOfRooms()) * getnOfFloors();
	}
}
