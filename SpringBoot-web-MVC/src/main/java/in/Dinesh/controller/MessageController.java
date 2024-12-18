package in.Dinesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController 
{
	@GetMapping("/firstmail")
	public ModelAndView getMsg()
	{
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("msg", "Congrats you are shortlished for the company");
		mav.setViewName("message");
		
		return mav;
	}
}
