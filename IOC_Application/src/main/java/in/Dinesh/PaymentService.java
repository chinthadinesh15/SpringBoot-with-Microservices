package in.Dinesh;

public class PaymentService
{
	private IPayment payment;
	
	public PaymentService()
	{
		System.out.println("0-arg Payment service Constructor");
	}
	
	public PaymentService(IPayment payment)
	{
		System.out.println("param-payment service Constructor");
		this.payment=payment;
	}
	
	public void setPayment(IPayment payment) 
	{
		this.payment = payment;
		System.out.println("Setter method is executed");
	}
	
	public void doPayment(Double amt)
	{
		boolean b=payment.processPayment(amt);
		
		if(b)
		{
			System.out.println("Recipt Printing....");
		}
		else
		{
			System.out.println("Card Declined....");
		}
	}
}
