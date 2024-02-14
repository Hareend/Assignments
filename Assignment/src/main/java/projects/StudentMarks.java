package projects;

public class StudentMarks 
{
	public StudentMarks(int a, int b, int c)
	{
		int total =a+b+c;
		System.out.println(total);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StudentMarks obj1 = new StudentMarks(100,100,100);
		StudentMarks obj2 = new StudentMarks(99,99,99);
	}

}
