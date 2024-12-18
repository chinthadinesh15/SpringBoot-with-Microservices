package in.Dinesh.service.impl;

import org.springframework.stereotype.Service;

import in.Dinesh.entity.Book;
import in.Dinesh.exception.BookNotFoundException;
import in.Dinesh.repository.BookRepository;
import in.Dinesh.service.IBookInterface;

@Service
public class BookServiceImpl implements IBookInterface
{
	BookRepository repo;

	@Override
	public Book getOneBook(Integer id) 
	{
		
		return repo.findById(id).orElseThrow(() -> new BookNotFoundException(id+", not exist"));
	}
	

}
