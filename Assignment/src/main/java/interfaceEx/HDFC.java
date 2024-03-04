package interfaceEx;

import java.util.Scanner;
public class HDFC implements RBI {

	@Override
	public float recurringDeposit() {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the principle amount: ");
		float amount = obj.nextFloat();
		System.out.println("Duration in Month: ");
		int duration = obj.nextInt();
		float interest = 9.75f;
		
		float finalamount = (amount*duration*interest)/100;
		System.out.println("Final Amount is: "+finalamount);
		return finalamount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h1 = new HDFC();
		h1.recurringDeposit();
	}

}
