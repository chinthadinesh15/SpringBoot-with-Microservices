package in.Dinesh.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class MsgRestConstroller 
{
	@GetMapping("/welcome/{name}")
	public String getWelcomeMsg(@PathParam("name") String name)
	{
		String msg="Welcome Dinesh";
		
		return msg;
	}
	
	@GetMapping("/good")
	public String greetMsg(@RequestParam("name") String name)
	{
		String msg= name+" Good Morning!!!!";
		
		return msg;
	}
	
	// send http own codes
	@GetMapping("/action")
	public ResponseEntity<String> showData()
	{
		String msg="How are you Dinesh";
		
		return new ResponseEntity<>(msg,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/action1")
	public ResponseEntity<Void> showData1()
	{
		System.out.println("Hii....");
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
