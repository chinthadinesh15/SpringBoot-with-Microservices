package in.Dinesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController 
{
	@GetMapping("/welcome")
	public String welcome()
	{
		String msg="Hello Dinesh";
		int i=10/0;
		return msg;
	}
	
}
