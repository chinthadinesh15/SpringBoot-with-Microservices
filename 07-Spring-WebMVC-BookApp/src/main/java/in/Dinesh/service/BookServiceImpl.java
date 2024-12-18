package in.Dinesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Dinesh.entity.Book;
import in.Dinesh.repo.BookRepository;

@Service
public class BookServiceImpl  implements BookService
{
	@Autowired
   private BookRepository repo;
   
	@Override
	public List<Book> getAllBooks() 
	{
		//return repo.findAll();	
		
		return repo.findByActiveSW("Y");
	}

	@Override
	public boolean saveBook(Book book) 
	{
		book.setActiveSW("Y");
		Book save = repo.save(book);
		
		if(save.getBookId()!=null)
		{
			return true;
		}
		return false;
	}

	@Override
	public void deleteBook(Integer bookId)
	{
		//hard delete
		//repo.deleteById(bookId);
		
		Optional<Book> byId = repo.findById(bookId);
		
		if(byId.isPresent())
		{
			Book book=byId.get();
			book.setActiveSW("N");
			repo.save(book);
		}
	}
	//edit
	@Override
	public Book getBookById(Integer bookId)
	{
		Optional<Book> byId = repo.findById(bookId);
		
		if(byId.isPresent())
		{
			return byId.get();
		}
		return null;
	}

}
  