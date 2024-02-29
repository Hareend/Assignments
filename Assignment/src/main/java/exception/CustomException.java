package exception;

public class CustomException {
	public void display(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("Age is below 18");
		}
		else
		{
			System.out.println("Eligible");
		}
	}


	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		CustomException obj= new CustomException();
		obj.display(17);
	}

}
