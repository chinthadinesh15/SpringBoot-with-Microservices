package in.Dinesh.dao;

public class UserDao 
{
	public void init()
	{
		System.out.println("Getting db Connection");
	}
	public void getData()
	{
		System.out.println("Getting data from database");
	}
	public void destroy()
	{
		System.out.println("Closing data from Database");
	}

}
