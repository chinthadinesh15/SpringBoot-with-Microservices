package in.Dinesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class User 
{
	public User() 
	{
		System.out.println("User COnstructor");
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/user")
	public ModelAndView userDetails()
	{
		ModelAndView v=new ModelAndView();
		
		v.addObject("id",101);
		v.addObject("name","Dinesh");
		v.addObject("Gender","Male");
		
		v.setViewName("index2");
		
		return v;
	}

}
