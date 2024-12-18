package in.Dinesh.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value="prototype")
public class Car
{
	
	
	private IEngine eng;
	
	public Car()
	{
		System.out.println("Constructor of Car Class....");
	}
	
   
	public Car(IEngine eng)
	{
		this.eng=eng;
		System.out.println("Constructor of Car Class....");
	}
	 @Autowired
	public void setEngine(IEngine eng)
	{
		this.eng=eng;
	}
	
	public void drive()
	{
		 int status=eng.start();
		 
		 if(status>0)
		 {
			 System.out.println("Journey begans.......");
		 }
		 else
		 {
			 System.out.println("Engine trouble");
		 }
	}
}
