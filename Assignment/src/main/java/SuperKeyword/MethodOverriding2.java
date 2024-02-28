package SuperKeyword;

public class MethodOverriding2 extends  MethodOveriding1{
	public void display()
	{
		System.out.println("Child Method");
		//super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MethodOverriding2 obj= new MethodOverriding2();
		MethodOveriding1 obj = new MethodOverriding2();
		obj.display1();
		
	}

}
