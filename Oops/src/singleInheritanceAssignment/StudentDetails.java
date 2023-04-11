package singleInheritanceAssignment;

public class StudentDetails {
	private String name;
	private int rollno;

	public void setNameStudent(String name) {
		this.name = name;
	}

	public String getNameStudent() {
		return name;
	}

	public void setRollnoStudent(int rollno) {
		this.rollno = rollno;
	}

	public int getRollnoStudent() {
		return rollno;
	}

	public void display() {
		System.out.println("Name is " + name + "Rollno : " + rollno);
	}
}
