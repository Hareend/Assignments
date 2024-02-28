package projects;

public class NumberReverseThis {

	int reverse=0;
	int a, remainder;
	public NumberReverseThis(int a)
	{
		this();
		while(a>0)
		{
			remainder = a%10;
			reverse = (reverse *10)+remainder;
			a=a/10;
		}
		System.out.println("Reversed Number is: "+reverse);
	}
	public NumberReverseThis()
	{
		System.out.println("Finding Reverse....");
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		NumberReverseThis obj = new NumberReverseThis(1234);
	}

}
