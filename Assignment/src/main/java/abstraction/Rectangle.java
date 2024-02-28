package abstraction;

public class Rectangle extends Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle();
		obj.disp();
		obj.display();
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("This is the Abstract method body");
	}

}
