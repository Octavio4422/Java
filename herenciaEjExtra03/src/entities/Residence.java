package entities;

public final class Residence extends NonHotel {

	private int nOfRooms;
	private boolean guildDiscount;
	private boolean sportsField;
	
	public Residence() {}

	public Residence(int nOfRooms, boolean guildDiscount, boolean sportsField) {
		super();
		this.nOfRooms = nOfRooms;
		this.guildDiscount = guildDiscount;
		this.sportsField = sportsField;
	}

	public int getnOfRooms() {
		return nOfRooms;
	}

	public void setnOfRooms(int nOfRooms) {
		this.nOfRooms = nOfRooms;
	}

	public boolean isGuildDiscount() {
		return guildDiscount;
	}

	public void setGuildDiscount(boolean guildDiscount) {
		this.guildDiscount = guildDiscount;
	}

	public boolean isSportsField() {
		return sportsField;
	}

	public void setSportsField(boolean sportsField) {
		this.sportsField = sportsField;
	}
	
}
