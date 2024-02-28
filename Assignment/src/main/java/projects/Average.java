package projects;

public class Average {
	
	public  Average(int a, int b, int c)
	{
		int average = (a+b+c)/3;
		System.out.println("Average is:"+average);
	}
	public  Average(float a, float b, float c)
	{
		float average = (a+b+c)/3;
		System.out.println("Average is:"+average);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average obj1 = new Average(10,10,10);
		Average obj2 = new Average(1.1f,1.1f,1.1f);
	}

}
