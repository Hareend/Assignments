package abstraction;

public class AbstractContractor extends AbstractEmployee{
	private int workhours;
	public AbstractContractor(String name, int payhour, int workhours)
	{
		super(name, payhour);
		this.workhours = workhours;
	}
	
	public int salaryCalculate()
	{
		return getpayhour()*workhours;
	}
}
