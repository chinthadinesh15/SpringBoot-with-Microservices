package in.Dinesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ProductController
{
	@GetMapping(value={"/","loadForm"})
	public String loadForm()
	{
		return "index";
	}
	
	@PostMapping(value="/saveProduct")
	public String handleSubmit(HttpServletRequest req,Model model)
	{
		//logic to save form data
		
		String pid=req.getParameter("pid");
		String pname=req.getParameter("pname");
		String price=req.getParameter("price");
		
		System.out.println("Product ID: "+pid);
		System.out.println("Product Name: "+pname);
		System.out.println("Product PRice: "+price);
		
		model.addAttribute("msg","Product Saved To Catalog SuccessFully........");
		return "success";
	}

}
