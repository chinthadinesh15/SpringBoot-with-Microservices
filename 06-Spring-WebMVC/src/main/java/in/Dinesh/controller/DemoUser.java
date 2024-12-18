package in.Dinesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.websocket.server.PathParam;

@Controller
public class DemoUser 
{
	@GetMapping("/user1")
	public String sendDataToUI(@RequestParam("name") String name,Model model)
	{
		String msgtext="Hello "+name;
		
		model.addAttribute("msg", msgtext);
		
		return "index";
		
	}

	@GetMapping("/user2/{name}")
	public String sendDataToUI2(@PathParam("name") String name,Model model)
	{
		String msgtext="Hello "+name;
		
		model.addAttribute("msg", msgtext);
		
		return "index";
		
	}
	
	@GetMapping("/user3")
	@ResponseBody
	public String getData()
	{
		String msg="Hello dinesh welcome!!!!!";
		return msg;
	}
}
