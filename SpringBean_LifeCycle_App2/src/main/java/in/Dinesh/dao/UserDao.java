package in.Dinesh.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDao implements InitializingBean,DisposableBean
{
	
	public void getData()
	{
		System.out.println("Getting data from database");
	}

	@Override
	public void destroy() throws Exception
	{
		System.out.println(" Destroy method is invoked");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("init method is invoked");
		// TODO Auto-generated method stub
		
	}
}