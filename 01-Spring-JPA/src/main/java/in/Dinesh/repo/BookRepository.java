package in.Dinesh.repo;

import org.springframework.data.repository.CrudRepository;

import in.Dinesh.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}