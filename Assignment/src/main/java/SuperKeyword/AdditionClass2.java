package SuperKeyword;

public class AdditionClass2 extends AdditionClass1{
	public void result()
	{
		super.addition();
		if(sum%10==0)
		{
			System.out.println("Number is Divisible by 10");
		}
		else
		{
			System.out.println("Number is not Divisible by 10");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionClass2 obj = new AdditionClass2();
		obj.result();
	}

}
