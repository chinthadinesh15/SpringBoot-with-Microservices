package in.Dinesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.Dinesh.entity.Book;
import in.Dinesh.service.BookService;

@Controller
public class BookController 
{
	@Autowired
	private BookService service;
	private Integer bookId;
	
	@GetMapping("/book")
	public ModelAndView getBook()
	{
		ModelAndView v=new ModelAndView();
		List<Book> list = service.getAllBooks();
		
		v.addObject("book",list);
		
		v.setViewName("bookView");
		
		
		return v;
	}
	
	@GetMapping("/index")
	public ModelAndView index()
	{
		ModelAndView m=new ModelAndView();
		
		// sending empty obj for form binding
		m.addObject("book",new Book());
		
		m.setViewName("index");
		
		return m;
	}
	
	
	
	@PostMapping("/book")
	public ModelAndView saveBook(Book book)
	{ 
		ModelAndView m=new ModelAndView();
		
		boolean status = service.saveBook(book);
		
		if(status)
		{
			m.addObject("succMsg","Insert Book is Successfully");
		}
		else
		{
			m.addObject("errMsg","failed to save...");
		}
		m.setViewName("index");
		
		return m;
	}
	@GetMapping("/delete")
	public ModelAndView deleteBook(@RequestParam("bookId")  Integer bookId)
	{

		service.deleteBook(bookId);
		
		ModelAndView m=new ModelAndView();
		List<Book> list = service.getAllBooks();
		m.addObject("book",list);
		m.setViewName("bookView");
		
		return m;
	}
	
	@GetMapping("/edit")
	public ModelAndView editBook(@RequestParam("bookId") Integer bookId)
	{
		Book bookById = service.getBookById(bookId);
		
		ModelAndView m = new ModelAndView();
		m.addObject("book",bookById);
		m.setViewName("index");
		
		return m;  
	}
}
