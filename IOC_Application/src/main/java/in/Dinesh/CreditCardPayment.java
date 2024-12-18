package in.Dinesh;

public class CreditCardPayment implements IPayment
{
	
	public CreditCardPayment()
	{
		System.out.println("Constructor of Credit Card");
	}
	@Override
	public boolean processPayment(Double amt) 
	{
		System.out.println("Credit card Payment Successfully");
		return true;
	}

}
