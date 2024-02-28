package finalkeyword;

public class FinalVariable {
	final int i=10;
	public void num()
	{
		//i=100;
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariable obj = new FinalVariable();
		obj.num();
	}

}
