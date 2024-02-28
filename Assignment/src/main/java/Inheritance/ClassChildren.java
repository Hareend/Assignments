//Hierarchical Inheritance
package Inheritance;

public class ClassChildren extends School{
	public void children()
	{
		System.out.println("Children Name");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassChildren obj = new ClassChildren();
		obj.display();
		//obj.classes();
		obj.children();
	}

}
