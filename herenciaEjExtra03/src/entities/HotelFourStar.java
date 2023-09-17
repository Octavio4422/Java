package entities;

import interfaces.Price;

public class HotelFourStar extends Hotel implements Price{
	
	private String gymType;
	private String restaurant;
	private int restaurantCapacity;
	
	public HotelFourStar() {}

	public HotelFourStar(String name, String direccion, String town, String manager, int nOfRooms, int nOfBeds,
			int nOfFloors, double roomPrice, String gymType, String restaurant, int restaurantCapacity) {
		
		super(name, direccion, town, manager, nOfRooms, nOfBeds, nOfFloors, roomPrice);
		this.gymType = gymType;
		this.restaurant = restaurant;
		this.restaurantCapacity = restaurantCapacity;
	}

	public String getGymType() {
		return gymType;
	}

	public void setGymType(String gymType) {
		this.gymType = gymType;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	public int getRestaurantCapacity() {
		return restaurantCapacity;
	}

	public void setRestaurantCapacity(int restaurantCapacity) {
		this.restaurantCapacity = restaurantCapacity;
	}

	@Override
	public double calculateRoomPrice() {
		double total = BASE + super.hotelCapacity();
		
		if(restaurantCapacity < 30) total+= 10;
		else if(restaurantCapacity > 30 && restaurantCapacity < 50) total+= 30;
		else total+= 50;
		
		if(gymType.equalsIgnoreCase("A")) total += 50;
		else if(gymType.equalsIgnoreCase("B")) total += 30;
		
		setRoomPrice(total);
		return getRoomPrice();
	}
	
}
