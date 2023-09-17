package entities;

import interfaces.Price;

public final class HotelFiveStar extends HotelFourStar implements Price{

	private int nOfConferenceRooms;
	private int nOfSuits;
	private int nOfLimousines;
	
	public HotelFiveStar() {}

	public HotelFiveStar(String name, String direccion, String town, String manager, int nOfRooms, int nOfBeds,
			int nOfFloors, double roomPrice, String gymType, String restaurant, int restaurantCapacity,
			int nOfConferenceRooms, int nOfSuits, int nOfLimousines) {
		
		super(name, direccion, town, manager, nOfRooms, nOfBeds, nOfFloors, roomPrice, gymType, restaurant,
				restaurantCapacity);
		this.nOfConferenceRooms = nOfConferenceRooms;
		this.nOfSuits = nOfSuits;
		this.nOfLimousines = nOfLimousines;
			
	}
	
	public int getnOfConferenceRooms() {
		return nOfConferenceRooms;
	}

	public void setnOfConferenceRooms(int nOfConferenceRooms) {
		this.nOfConferenceRooms = nOfConferenceRooms;
	}

	public int getnOfSuits() {
		return nOfSuits;
	}

	public void setnOfSuits(int nOfSuits) {
		this.nOfSuits = nOfSuits;
	}

	public int getnOfLimousines() {
		return nOfLimousines;
	}

	public void setnOfLimousines(int nOfLimousines) {
		this.nOfLimousines = nOfLimousines;
	}

	@Override
	public double calculateRoomPrice() {
		double total = super.calculateRoomPrice();
		
		total+= nOfLimousines * 15;
		
		setRoomPrice(total);
		return getRoomPrice();
	}

}
