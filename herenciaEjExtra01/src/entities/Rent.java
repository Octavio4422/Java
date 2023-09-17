package entities;

import java.time.LocalDate;
import java.time.Period;

public class Rent {
	private String name;
	private int cid;
	private LocalDate rentDate;
	private LocalDate returnDate;
	private int position;
	private Ship ship;

	public Rent() {}

	public Rent(String name, int cid, LocalDate rentDate, LocalDate returnDate, int position, Ship ship ) {
		this.name = name;
		this.cid = cid;
		this.rentDate = rentDate;
		this.returnDate = returnDate;
		this.position = position;
		this.ship = ship;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public LocalDate getRentDate() {
		return rentDate;
	}

	public void setRentDate(LocalDate rentDate) {
		this.rentDate = rentDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	public int rent() {
		Period period = Period.between(rentDate, returnDate);
		int totalDays = period.getDays() + period.getMonths() * 30 + period.getYears() * 365;
		return totalDays * ship.calculoEslora();
	}
	
	@Override
	public String toString() {
		return "Rent [name=" + name + ", cid=" + cid + ", rentDate=" + rentDate + ", returnDate=" + returnDate + "]";
	}

}
