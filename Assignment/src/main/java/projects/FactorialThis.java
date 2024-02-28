package projects;

public class FactorialThis {
	int fact = 1, n;
	public void factorial(int n)
	{
		this.n=n;
		for(int i=1;i<=n;i++)
		{
			this.fact = fact * i;
		}
		System.out.println("factorial of the number "+n+" is: "+fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialStatic.factorial(6);
	}

}
