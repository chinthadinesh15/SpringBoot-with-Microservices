package in.Dinesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController 
{
	public WelcomeController() 
	{
		System.out.println("Welcome Controller :: Constructor");
	}
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg()
	{
		System.out.println("Ok");
		ModelAndView m=new ModelAndView();
		
		m.addObject("msg","Welcome Chintha Dinesh Babu");
		m.addObject("msg1", "Welcome to SpringBoot Classes");
		
		m.setViewName("index");
		
		return m;
	}
}
