package in.Dinesh.Singleton_DesignPattern;

public class A2 
{
	static A2 a=new A2();
	
	private A2()
	{
		System.out.println("Private Constructor...........");
		
	}
	
	static A2 getRef()
	{
		return a;
	}

}
