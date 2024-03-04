package encapsulation;

public class BankEncapsulation {
	private int pin;
	public int getPin()
	{
		return pin;
	}
	public void pinSet(int pin)
	{
		this.pin = pin;
	}
	public void valid()
	{
		this.pin = pin;
		switch(pin)
		{
		case 1001:
			System.out.println("Entered is valid pin");
			break;
		case 1234:
			System.out.println("Entered is valid pin");
			break;
		case 1212:
			System.out.println("Entered is valid pin");
			break;
		default:
			System.out.println("Entered is Invalid");
		}
	}

}
