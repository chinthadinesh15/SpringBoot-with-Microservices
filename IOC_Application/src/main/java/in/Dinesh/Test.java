package in.Dinesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) 
	{
		ApplicationContext ac =new ClassPathXmlApplicationContext("Beans.xml");
		
		//how to get object from IOC
		PaymentService ps=ac.getBean(PaymentService.class);
		ps.doPayment(3000.00);
		
	}

}
