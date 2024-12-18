package in.Dinesh.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController 
{
	@Value("${msg}")
	private String msgTxt;
	
	@GetMapping("/")
	public String getMsg()
	{
		return msgTxt;
		
	}

}
