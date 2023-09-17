package Entitites;

public class Employee extends Person {

	protected int yearOfI;
	protected int dispatch;
	
	public Employee() {}

	public Employee(String name, String lastName, int id, String maritalStatus, int yearOfI, int dispatch) {
		super(name, lastName, id, maritalStatus);
		this.yearOfI = yearOfI;
		this.dispatch = dispatch;
	}

	public int getYearOfI() {
		return yearOfI;
	}

	public void setYearOfI(int yearOfI) {
		this.yearOfI = yearOfI;
	}

	public int getDispatch() {
		return dispatch;
	}

	public void setDispatch(int dispatch) {
		this.dispatch = dispatch;
	}

	@Override
	public String toString() {
		return "Employee [yearOfI=" + yearOfI + ", dispatch=" + dispatch + "]";
	};
	
}
