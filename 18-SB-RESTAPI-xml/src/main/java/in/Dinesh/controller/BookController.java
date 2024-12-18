package in.Dinesh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Dinesh.binding.Book;

@RestController
public class BookController 
{
	@PostMapping(
			value="/book",
			consumes={"application/xml","application/json"},
			produces="text/plain"
	)
	public String addBook(@RequestBody  Book b)
	{
		System.out.println(b);
		
		//logic to save in db
		 
		return "Book Added";
	}
	
	
	@GetMapping(value="/book",produces={"application/xml","application/json"})
	public Book getBook()
	{
		Book b=new Book(101,"java",600.0);
		
		return b;
	}
}
