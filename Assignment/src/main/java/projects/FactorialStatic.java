package projects;

public class FactorialStatic {
	public static void factorial(int n)
	{
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact = fact * i;
		}
		System.out.println("factorial of the number "+n+" is: "+fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialStatic.factorial(6);
	}

}
