package SuperKeyword;

public class RuntimePolymorphism2 extends RuntimePolymorphism1{
	public void display()
	{
		
		System.out.println("Child class Runtime Polymorphism");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuntimePolymorphism1 obj = new RuntimePolymorphism2();
		obj.display();
	}

}
