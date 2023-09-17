package entities;

public abstract class Lodge {
	protected String name;
	protected String direccion;
	protected String town;
	protected String manager;
	
	public Lodge() {}

	public Lodge(String name, String direccion, String town, String manager) {
		this.name = name;
		this.direccion = direccion;
		this.town = town;
		this.manager = manager;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	};
		
}
