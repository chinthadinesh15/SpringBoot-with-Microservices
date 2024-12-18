package in.Dinesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.websocket.server.PathParam;


// reading data from ulr and print in web brower
@Controller
public class EmployeeControler
{
	@GetMapping("/data")
	public String readData(@RequestParam("ename")String name,@RequestParam("esal") Double sal,Model model)
	{
		System.out.println(name+" "+sal);
		
		model.addAttribute("empName",name);
		model.addAttribute("empSal", sal);
		
		return "EmployeeData";
	}
	
	@GetMapping("/data1")
	public String readData1(@RequestParam("ename")String name,@RequestParam(value="esal",required=false,defaultValue="2000.0") Double sal,Model model)
	{
		System.out.println(name+" "+sal);
		
		model.addAttribute("empName",name);
		model.addAttribute("empSal", sal);
		
		return "EmployeeData";
	}
	
	@GetMapping("/student")
	public String showData()
	{
		System.out.println("Show data is called");
		
		return "student";
	}
	@GetMapping("/delete")
	public String deleteStudentData()
	{
		System.out.println("Delete Method is Called");
		
		return "redirect:student";
	}
}
