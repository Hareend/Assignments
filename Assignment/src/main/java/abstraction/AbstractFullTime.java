package abstraction;

public class AbstractFullTime extends AbstractEmployee{
	public AbstractFullTime(String name, int payhour)
	{
		super(name,payhour);
	}
	
	public int salaryCalculate()
	{
		return getpayhour()*8;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEmployee emp = new AbstractContractor("Contractor", 30, 15);
		AbstractEmployee emp1 = new AbstractFullTime("Full Time Employee", 10);
		System.out.println(emp.salaryCalculate());
		System.out.println(emp1.salaryCalculate());

	}

}
