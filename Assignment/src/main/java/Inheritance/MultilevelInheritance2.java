package Inheritance;

public class MultilevelInheritance2 extends MultilevelInheritance1{
	public void display2()
	{
		System.out.println("Class C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritance2 obj = new MultilevelInheritance2();
		obj.display();
		obj.display1();
		obj.display2();
	}

}
