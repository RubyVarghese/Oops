package aggregationAssignment;

public class StudentDetails {
	private String name;
	private int rollno;
	private StudentAddress studentaddress;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getRollno() {
		return rollno;
	}

	public void setAddress(StudentAddress studentaddress) {
		this.studentaddress = studentaddress;
	}

	public StudentAddress getAddress() {
		return studentaddress;
	}

	public static void main(String args[])
	{
		StudentDetails sd= new StudentDetails();
		sd.setName("Ruby");
		sd.setRollno(15);
		
		StudentAddress sa=new StudentAddress();
		sa.setHousename("ABC villa");
		sa.setStreetname("ABC");
		sa.setPin("689511");
		
		sd.setAddress(sa);
		System.out.println("Student Name is " +sd.getName());
		System.out.println("Student rollno is "+sd.getRollno());
		System.out.println("Address :");
		System.out.println("House Name  "+sd.getAddress().getHousename());
		System.out.println("StreetName " +sd.getAddress().getStreetname());
		System.out.println("PinCode " +sd.getAddress().getPin());
	}
}
