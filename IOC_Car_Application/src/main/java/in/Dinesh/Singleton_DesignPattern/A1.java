package in.Dinesh.Singleton_DesignPattern;

public class A1 
{
	static A1 a=null;
	
	//private Constructor
	private A1()
	{
		System.out.println("Constructor");
	}
	
	static 
	{
		System.out.println("static Block");
		a=new A1();
	}

	static A1 getRef()
	{
		return a;
	}

}