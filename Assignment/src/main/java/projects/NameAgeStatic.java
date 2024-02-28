package projects;

public class NameAgeStatic {
	static String name;
	static int age;

	public static void nameage(String n, int a)
	{
		name = n;
		age = a;
	}
	public static void display()
	{
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameAgeStatic.nameage("Hareend", 36);
		NameAgeStatic.display();
	}

}
