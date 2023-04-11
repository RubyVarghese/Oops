package hierarchialInheritance;

public class ContractEmployee extends Employee1 {
	private int sal;
	private String payrollcompany;

	public void setSalcontract(int sal) {
		this.sal = sal;
	}

	public int getSalcontract() {
		return sal;
	}

	public void setPayrollCompany(String payrollcompany) {
		this.payrollcompany = payrollcompany;
	}

	public String getPayrollCompany() {
		return payrollcompany;
	}

	private void calculateSal() {
		sal = sal + 10000;
	}

	public void display() {
		System.out.println("Name :"+getEmployeename()+ "Employeid "+getEmployeeid());
		calculateSal();
		System.out.println("Salary :" + getSalcontract());
		System.out.println("Payroll :" + getPayrollCompany());
	}
}
