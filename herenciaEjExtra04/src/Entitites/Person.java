package Entitites;

public abstract class Person {

	protected String name;
	protected String lastName;
	protected int id;
	protected String maritalStatus;
	
	public Person() {}

	public Person(String name, String lastName, int id, String maritalStatus) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", id=" + id + ", maritalStatus=" + maritalStatus
				+ "]";
	};

}
