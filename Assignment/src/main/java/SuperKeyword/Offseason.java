package SuperKeyword;
import java.util.Scanner;

public class Offseason {
	double cost;
	public double discount()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Amount: ");
		cost = obj.nextDouble();
		double disccost = cost*0.15;
		System.out.println("Off Season Proce after Discount is:"+disccost);
		return disccost;
		
	}
}
