package mutilevelInheritanceAssignment;

public class SalaryDeduction {
	private String empname;
	public int basicpay;
	public int deduction;
	public int bonus;

	public void setName(String empname) {
		this.empname = empname;
	}

	public String getName() {
		return empname;
	}

	public void setBasicpay(int basicpay) {
		this.basicpay = basicpay;
	}

	public int getBasicpay() {
		return basicpay;
	}

	public void setDeduction(int deduction) {
		this.deduction = deduction;

	}

	public int getDeduction() {
		return deduction;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void display() {
		System.out.println("Name :" + empname);
		System.out.println("Basic Pay :" + getBasicpay());
		System.out.println("Deduction : " +getDeduction());
		System.out.println("Bonus : " +getBonus());
	}

}
