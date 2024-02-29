package Inheritance;
import java.util.*;

public class Employee1 {
	double basicpay;
	double deduction;
	double bonus;
	
	public void empInput()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Please insert Basic Pay: ");
		basicpay = obj.nextInt();
		System.out.println("Please insert Deduction Amount: ");
		deduction = obj.nextInt();
		System.out.println("Please insert Bonus Amount: ");
		bonus = obj.nextInt();
	}
	
	
}
