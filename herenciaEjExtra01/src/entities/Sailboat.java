package entities;

import java.time.LocalDate;

public class Sailboat extends Ship {
	
	private int nOfMasts;
	
	public Sailboat() {}

	public Sailboat(String plate, int eslora, LocalDate mfDate, int nOfMasts) {
		super(plate, eslora, mfDate);
		this.nOfMasts = nOfMasts;
	}

	public int getnOfMasts() {
		return nOfMasts;
	}

	public void setnOfMasts(int nOfMasts) {
		this.nOfMasts = nOfMasts;
	}

	public int calculoEslora() {
		 return super.calculoEslora() + nOfMasts;
	}
	
	@Override
	public String toString() {
		return "Sailboat [nOfMasts=" + nOfMasts + "]";
	}
	
}
