package in.Dinesh.Singleton_DesignPattern;

public class College 
{
	static College c=null;
	
	
	// private Constructor
	private College()
	{
		
	}
	
	static College get_ref()
	{
		if(c==null)
		{
			c=new College();
			return c;
		}
		else
		{
			return c;
		}
	}

}
