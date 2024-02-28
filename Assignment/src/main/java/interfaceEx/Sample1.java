package interfaceEx;

public class Sample1 implements Sample {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is an Interface...");
	}
	public static void main(String args[])
	{
		Sample1  obj = new Sample1();
		obj.display();
	}

}
