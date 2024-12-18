package in.Dinesh;

public class DebitCardPayment implements IPayment
{
	
	public DebitCardPayment() 
	{
		System.out.println("Constructor of Debit Card Payment");
	}
	
	@Override
	public boolean processPayment(Double amt) 
	{
		System.out.println("Debit Card Payment Successfull");
		return true;
	}
	

}
