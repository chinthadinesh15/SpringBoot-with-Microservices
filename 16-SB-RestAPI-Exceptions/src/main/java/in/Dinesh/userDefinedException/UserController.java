package in.Dinesh.userDefinedException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController 
{
	@GetMapping("/user/{uid}")
	public String getNameByid(@PathVariable("uid") Integer uid)
	{
		if(uid<=100)
		{
			return "Dinesh";
		}
		else
		{
			throw new NoUserFoundException("Invalid Id");
		}
	}

}
