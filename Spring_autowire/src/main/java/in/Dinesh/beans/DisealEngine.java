package in.Dinesh.beans;

public class DisealEngine implements IEngine
{
	public DisealEngine() 
	{
		System.out.println("Constructor of Diseal Engine....");
	}
	@Override
	public int start() 
	{
		System.out.println("Diseal ENgine Started....");
		return 1;
	}

}
