package encapsulation;

public class School {

	public static void main(String[] args) {
		Studentdetails sd=new Studentdetails();
		//sd.setSchool("Abc");
		sd.setName("Ruby");
		sd.setAge(15);
		sd.setIspass(true);// setter method of boolean object
		
		System.out.println("School name :" +sd.getSchool());
		System.out.println("Name is " +sd.getName());
		System.out.println("Age is  " +sd.getAge());
		System.out.println("Student is  " +sd.isIspass());//getter method
	}

}
