package in.Dinesh.beans;

public class Car 
{
	private IEngine eng;
	
	public Car() 
	{
		System.out.println("0-param Car Constructor");
	}
	
	public Car(IEngine eng)
	{
		this.eng=eng;
		System.out.println("1-param Car Constructor");
	}
	
	
	public void setEng(IEngine eng) 
	{
		
		this.eng = eng;
		System.out.println("Setter Method Executed....");
	}

	public void drive()
	{
		int status=eng.start();
		
		if(status>=1)
		{
			System.out.println("Journey Begins.....");
		}
		else
		{
			System.out.println("Engine Trouble.....");
		}
	}

}
