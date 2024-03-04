package abstraction;

public abstract class AbstractEmployee {
	private String name;
	private int payhour;
	
	public AbstractEmployee(String name, int payhour)
	{
		this.name = name;
		this.payhour = payhour;
	}
	
	public abstract int salaryCalculate();
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name= name;
	}
	public int getpayhour()
	{
		return payhour;
	}
	public void setpayhour(int payhour)
	{
		this.payhour = payhour;
	}

}
