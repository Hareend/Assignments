package projects;

public class CustomerStaticMethod {
	static double total;
	public static void totalamount(int item1, int item2, int item3)
	{
		total = item1+item2+item3;
	}
	public static void discount()
	{
		if(total>5000)
		{
			total = total-(total*0.02);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerStaticMethod.totalamount(1500, 2500, 1750);
		CustomerStaticMethod.discount();
		System.out.println("Final amount after discount is: "+total);
	}

}
