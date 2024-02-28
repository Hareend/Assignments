package projects;

public class PaliandromeStatic {
	static int r, temp;
	static int reverse = 0;

	public static void ReverseValue(int num)
	{
		r=num;
		while(num>0)
		{
			temp= num%10;
			reverse = (reverse*10)+temp;
			num = num/10;
		}
		System.out.println("Reversed Number is: "+reverse);
	}
	
	public static void paliandromecheck()
	{
		if(r==reverse)
		{
			System.out.println("Number is Paliandrome");
		}
		else
		{
			System.out.println("Number is not a Paliandrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaliandromeStatic.ReverseValue(1221);
		PaliandromeStatic.paliandromecheck();
	}

}
