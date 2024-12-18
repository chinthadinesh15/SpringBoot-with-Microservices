package in.Dinesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.Dinesh.entity.Employee;

@Controller
public class EmployeeController 
{
	
	
	@GetMapping("/register")
	public String showForm()
	{
		return "EmployeeRegister";
	}
	
	//Read form data and save + Post
	@PostMapping("/save")
	public String readForm(@ModelAttribute Employee employee,Model model)
	{
		System.out.println(employee);
		
		//send data to UI
		model.addAttribute("employee", employee);
		return "EmployeeData";
	}
}
