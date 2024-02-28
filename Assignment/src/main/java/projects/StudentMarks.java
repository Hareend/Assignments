package projects;

public class StudentMarks 
{
	int total, grade;
	public StudentMarks(int a, int b, int c)
	{
		this.total = a+b+c;
		this.grade = total/3;
		System.out.println(total);
		if(grade>=90)
		{
			System.out.println("Grade is A");
		}
		else if(grade>=70 && grade < 90)
		{
			System.out.println("Grade is B");
		}
		else 
		{
			System.out.println("Grade is C");
		}	
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StudentMarks obj1 = new StudentMarks(100,100,100);
		StudentMarks obj2 = new StudentMarks(85,80,82);
		StudentMarks obj3 = new StudentMarks(50,60,70);
	}

	
}
