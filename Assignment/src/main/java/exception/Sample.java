package exception;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int a = 10;
			int b = 0;
			int c;
		//System.out.println("Before Exception");
		
			c = a/b;
		}
		catch(ArithmeticException d)
		{
			System.out.println("Exception occured, please skip " +d);
		}
		/*finally
		{
			System.out.println("Exception Checked");
		}
		*/
		//System.out.println("After Exception");
		//System.out.println(c);
	}

}
