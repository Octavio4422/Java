package entities;

import java.time.LocalDate;

public class MotorBoat extends Ship {

	private int cv;
	
	public MotorBoat() {}

	public MotorBoat(String plate, int eslora, LocalDate mfDate, int cv) {
		super(plate, eslora, mfDate);
		this.cv = cv;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public int calculoEslora() {
		return super.calculoEslora() + cv;
	}
	
	@Override
	public String toString() {
		return "MotorBoat [cv=" + cv + "]";
	}
		
}
