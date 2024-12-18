package in.Dinesh.dao;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

//dependsOn 

@Service
@DependsOn("userdao")
public class UserService 
{
	public UserService() 
	{
		System.out.println("Getting data from redis....");
	}
}
