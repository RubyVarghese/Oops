package hierarchialInheritance;

public class HierarchialInheritance {

	public static void main(String[] args) {

		PermanentEmployee pe = new PermanentEmployee();

		pe.setEmployeename("Ruby");
		pe.setEmployeeid(235);
		pe.setSalary(30000);
		pe.calculateSalary();
		System.out.println();

		ContractEmployee ce = new ContractEmployee();
		ce.setEmployeename("Leeda");
		ce.setEmployeeid(356);
		ce.setPayrollCompany("ABC");
		ce.setSalcontract(35000);
		ce.display();
	}

}
