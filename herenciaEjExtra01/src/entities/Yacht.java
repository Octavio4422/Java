package entities;

import java.time.LocalDate;

public class Yacht extends Ship {
	
	private int cv;
	private int nOfCabins;
	
	public Yacht() {}

	public Yacht(String plate, int eslora, LocalDate mfDate, int cv, int nOfCabins) {
		super(plate, eslora, mfDate);
		this.cv = cv;
		this.nOfCabins = nOfCabins;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public int getnOfCabins() {
		return nOfCabins;
	}

	public void setnOfCabins(int nOfCabins) {
		this.nOfCabins = nOfCabins;
	}

	public int calculoEslora() {
		return super.calculoEslora() + cv + nOfCabins;
	}
	
	@Override
	public String toString() {
		return "Yacht [cv=" + cv + ", nOfCabins=" + nOfCabins + "]";
	}
		
}
