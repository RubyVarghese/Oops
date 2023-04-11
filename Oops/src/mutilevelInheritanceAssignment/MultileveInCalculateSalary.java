package mutilevelInheritanceAssignment;

public class MultileveInCalculateSalary extends CalculateHra {

	public static void main(String args[]) {
		
		MultileveInCalculateSalary m=new MultileveInCalculateSalary();
		m.setName("Ruby");
		System.out.println("Salary Slip");
		m.setBasicpay(35000);
		m.setDeduction(2000);
		m.setBonus(2500);
		m.display();
		
		System.out.println();
		m.calculateHra();
		m.calculatePf();
		System.out.println("Total Salary by hand :");
		m.totalSal();
		

	}


}
