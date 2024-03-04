package SuperKeyword;

public class Onseason extends Offseason {
	
	double OnCost;
	public double discount()
	{
		super.discount();
		double OnCost = cost*0.40;
		System.out.println("Off Season Proce after Discount is:"+OnCost);
		return OnCost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onseason obj = new Onseason();
		obj.discount();
	}

}
