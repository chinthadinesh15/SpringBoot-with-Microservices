package in.Dinesh.service;

import java.util.List;

import in.Dinesh.entity.Book;

public interface BookService 
{
	public List<Book> getAllBooks();
	
	public boolean saveBook(Book book);
	 
	public void deleteBook(Integer bookId);
	
	//edit book
	public Book getBookById(Integer bookId);

}
