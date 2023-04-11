package multilevelInheritance;

//import singleInheritance.Person;

public class Employee extends Person1 {
	private int empid;
	public void setEmployee(int empid)
	{
		this.empid=empid;
	}
	public int getEmpid()
	{
		return empid;
	}

}
