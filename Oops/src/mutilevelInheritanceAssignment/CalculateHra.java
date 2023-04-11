package mutilevelInheritanceAssignment;

public class CalculateHra extends SalaryDeduction {
	private  int hra;
	 private int pf;
	 private int totalsal;

	public void calculateHra() {
		hra = (getBasicpay() * 5) / 100;
		System.out.println("Hra is " +hra);
	}

	public void calculatePf() {
		pf = (basicpay * 20) / 100;
		System.out.println("Pf is " +pf);
	}

	public void totalSal() {
		totalsal = (basicpay + hra + pf) - (deduction + bonus);
		System.out.println("Salary: "+totalsal+ " Rupees only");
	}
	

}
