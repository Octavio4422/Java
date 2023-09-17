package Entitites;

public class Student extends Person {

	private int course;
	
	public Student() {}

	public Student(String name, String lastName, int id, String maritalStatus, int course) {
		super(name, lastName, id, maritalStatus);
		this.course = course;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}
	
}
