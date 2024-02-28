package aggregation;

public class AggregationAddress {
	String address;
	AggregationStudent ast;
	
	public AggregationAddress(String address, AggregationStudent ast)
	{
		this.address=address;
		this.ast =ast;
	}
	public void print()
	{
		System.out.println(ast.name+" "+ast.rollno+" "+ address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationStudent as = new AggregationStudent("Hareend", 36);
		AggregationAddress aa = new AggregationAddress("Trivandrum",as);
		aa.print();
	}

}
