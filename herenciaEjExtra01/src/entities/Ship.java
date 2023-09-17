package entities;

import java.time.LocalDate;

public class Ship {
	private String plate;
	private int eslora;
	private LocalDate mfDate;
	
	public Ship() {}

	public Ship(String plate, int eslora, LocalDate mfDate) {
		this.plate = plate;
		this.eslora = eslora;
		this.mfDate = mfDate;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public int getEslora() {
		return eslora;
	}

	public void setEslora(int eslora) {
		this.eslora = eslora;
	}

	public LocalDate getMfDate() {
		return mfDate;
	}

	public void setMfDate(LocalDate mfDate) {
		this.mfDate = mfDate;
	}

	
	public int calculoEslora() {
		return eslora * 10;
	}
	
	@Override
	public String toString() {
		return "Ship [plate=" + plate + ", eslora=" + eslora + ", mfDate=" + mfDate + "]";
	}
	
}
