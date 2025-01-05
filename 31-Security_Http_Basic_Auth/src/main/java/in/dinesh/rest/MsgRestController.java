package in.dinesh.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController 
{
	@GetMapping("/welcome")
	public String getMsg()
	{
		return "Welcome to Spring Security";
	}
	 
	@GetMapping("/contact")
	public String contactUs()
	{
		return " 9160198172";
	}
	
	@GetMapping("/transfer")
	public String transform()
	{
		return "Successfully transfer Money ";
	}
}
