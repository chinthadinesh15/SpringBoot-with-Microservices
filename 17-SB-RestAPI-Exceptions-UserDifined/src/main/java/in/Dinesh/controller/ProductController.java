package in.Dinesh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.Dinesh.exception.ProductNotFoundEception;

@RestController
public class ProductController 
{
	@GetMapping("/product/{pid}")
	public String getProduct(@PathVariable("pid") Integer pid)
	{
		if(pid==100)
		{
			return "Product Available";
		}
		else
		{
			throw new ProductNotFoundEception("Invalid product id");
		}
	}
}
