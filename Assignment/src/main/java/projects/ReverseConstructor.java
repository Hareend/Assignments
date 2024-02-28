package projects;

public class ReverseConstructor {
	
	int reverse;
	public ReverseConstructor(int numb)// inside the bracket argument variable
	{
		//this();// instance variable
		while(numb != 0)
		{
			int remainder = numb%10;
			reverse = reverse * 10 + remainder;
			numb = numb/10;
			
		}
		
		//System.out.println(reverse);
	}
	public ReverseConstructor()
	{
		System.out.println("Reversed Number is: "+reverse);
	}
	public static void main(String args[])
	{
		ReverseConstructor obj = new ReverseConstructor(1234);
	}

}
