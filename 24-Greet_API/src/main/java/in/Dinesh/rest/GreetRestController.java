package in.Dinesh.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Dinesh.client.WelcomeApiClient;

@RestController
public class GreetRestController 
{
	@Autowired
	private WelcomeApiClient welcomeClient;
	
	@GetMapping("/greet")
	public String greetGetmsg()
	{
		String welcome=welcomeClient.invokeWelcomeMSG();
		String greetMsg="Good night!!!, ";
		
		return greetMsg.concat(welcome);
	}

}
