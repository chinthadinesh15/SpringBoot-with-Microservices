package in.Dinesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Dinesh.entity.Book;
import in.Dinesh.entity.BookPK;
import in.Dinesh.repo.BookRepo;

@Service
public class BookService 
{
	@Autowired
	private BookRepo repo;
	
	public void saveBook()
	{
		BookPK pk=new BookPK(101,"java");
		
		Book b=new Book(1000.0,"james",pk);
		
		repo.save(b);
		System.out.println("Record saved.....");
		
		
	}

}
