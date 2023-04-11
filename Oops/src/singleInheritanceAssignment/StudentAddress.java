package singleInheritanceAssignment;

public class StudentAddress extends StudentDetails {
	private String Address;

	public void setAddress(String Address) {
		this.Address = Address;
		System.out.println("Address : "+Address);
	}

	public String getAddress() {
		return Address;
		
	}

	public static void main(String[] args) {

		StudentAddress s = new StudentAddress();
		s.setNameStudent("Ruby");
		s.setRollnoStudent(15);
		s.setAddress("Abc");
		s.display();
	}

}
