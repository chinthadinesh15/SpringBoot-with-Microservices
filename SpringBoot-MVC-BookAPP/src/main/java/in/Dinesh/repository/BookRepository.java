package in.Dinesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Dinesh.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> 
{

}
