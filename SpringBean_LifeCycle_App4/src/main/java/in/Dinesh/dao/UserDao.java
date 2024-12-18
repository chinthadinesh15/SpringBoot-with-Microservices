package in.Dinesh.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("userdao")
public class UserDao implements InitializingBean
{
	@Override
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("Get data from DB");
		System.out.println("Store the data into Redis");
	}
	
}
