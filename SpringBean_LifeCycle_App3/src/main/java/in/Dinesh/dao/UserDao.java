package in.Dinesh.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component
public class UserDao
{
	@PostConstruct
	public void init()
	{
		System.out.println("Getting from DB");
	}
	
	public void getData()
	{
		System.out.println("Getting data from database");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy");
	}

	
}
