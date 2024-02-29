package Inheritance;

public class Employee2 extends Employee1{
	double hra;
	double pf;
	
	public void calculation()
	{
		hra = super.basicpay*0.05;
		pf = super.basicpay*0.2;
	}
}
