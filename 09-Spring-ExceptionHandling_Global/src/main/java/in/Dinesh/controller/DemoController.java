package in.Dinesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController 
{
	@GetMapping("/show2")
	public String showMsg(Model model)
	{
		String msg="Hello Dinesh";
		model.addAttribute("text", msg);
		
		int i=1/0;
		
		return"index";
		
	}
	
	

}
