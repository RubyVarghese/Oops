package multilevelInheritance;

public class Tester extends Employee {
	private String dept;
	public void setDepartment(String dept)
	{
		this.dept=dept;
		
	}
	public void show()
	{
		display();
		System.out.println("Employee id: " +getEmpid()+ "Department :" +dept);
		
	}

}
