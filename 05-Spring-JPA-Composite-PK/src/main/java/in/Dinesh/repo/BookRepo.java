package in.Dinesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Dinesh.entity.Book;
import in.Dinesh.entity.BookPK;

public interface BookRepo extends JpaRepository<Book, BookPK> 
{

}
