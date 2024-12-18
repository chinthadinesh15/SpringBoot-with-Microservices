package in.Dinesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Product 
{
	@GetMapping("/data")
	public String showdata(Model model)
	{
		String name=null;
		name.length();
		model.addAttribute("text", name);
		
		return"index";
	}

}
