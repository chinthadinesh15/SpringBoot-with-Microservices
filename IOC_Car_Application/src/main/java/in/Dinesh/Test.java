package in.Dinesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
		
		//get object from IOC
		Car c=ac.getBean(Car.class);
//		
		c.drive();
//		
		
		//singleton design pattern by default
//		Car c=ac.getBean(Car.class);
//		System.out.println(c.hashCode());
//		
//		System.out.println("------------------------");
//		
//		Car c1=ac.getBean(Car.class);
//		System.out.println(c1.hashCode());
		
		
	}

}
