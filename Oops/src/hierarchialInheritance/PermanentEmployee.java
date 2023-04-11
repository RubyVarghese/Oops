package hierarchialInheritance;

public class PermanentEmployee extends Employee1 {
	private int sal;

	public void setSalary(int sal) {
		this.sal = sal;
	}

	public int getSalary() {
		return sal;
	}
	public void calculateSalary()
	{
		System.out.println("Name :"+getEmployeename()+ "Employe"+getEmployeeid());
		sal=sal*2+sal;
		System.out.println("Salary :" +sal);
	}

}
