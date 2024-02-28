package projects;

public class NumberReverse 
{
	int reverse;
	public NumberReverse(int a)
	{
		int reverse =0;
		while(a!=0)
		{
			int remainder = a%10;
			reverse = reverse *10+remainder;
			a=a/10;
		}
	}
	public NumberReverse()
	{
		//this();
		System.out.println("Reversed Number is: "+reverse);
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//NumberReverse obj = new NumberReverse("1234");
	}

}
