package in.Dinesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.Dinesh.entity.Book;
import in.Dinesh.exception.BookNotFoundException;
import in.Dinesh.service.IBookInterface;

@Controller
public class BookController 
{
	@Autowired
	private IBookInterface service;
	
	@GetMapping("/book")
	public String getBookById(@RequestParam("id") Integer id,Model model)
	{
		System.out.println("ID ="+id);
		
		String message=null;
		Book book=null;
		
		try
		{
			book=service.getOneBook(id);
			message="Book Present dude";
		}
		catch (BookNotFoundException e)
		{
			e.printStackTrace();
			message=e.getMessage();
		}
		
		model.addAttribute("book",book);
		model.addAttribute("message",message);
		
		return "index";
	}

}
