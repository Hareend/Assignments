package exception;

public class ThrowException {
	public void display()
	{
		int age = 10;
		if(age<18)
		{
			throw new ArithmeticException("Age is less than 18! So, not eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException obj = new ThrowException();
		obj.display();
	}

}
