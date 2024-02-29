package Inheritance;

public class Employee3 extends Employee2 {
	static double totalsalary;
	
	public void salary()
	{
		totalsalary = super.basicpay+super.hra-super.pf-super.deduction+super.bonus;
	}
	
	public void salarySlips()
	{
		System.out.println();
		System.out.println("Salary Slip");
		System.out.println("Basic Pay:  "+super.basicpay);
		System.out.println("Deduction:  "+super.deduction);
		System.out.println("HRA:        "+super.hra);
		System.out.println("PF:         "+super.pf);
		System.out.println("Bonus:      "+super.bonus);
		System.out.println("Total Salary:"+totalsalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 obj = new Employee3();
		obj.empInput();
		obj.calculation();
		obj.salary();
		obj.salarySlips();
	}

}
