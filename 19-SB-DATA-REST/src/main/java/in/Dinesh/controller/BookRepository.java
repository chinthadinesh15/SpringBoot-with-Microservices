package in.Dinesh.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.Dinesh.entity.Book;

@RepositoryRestResource(path="books")
public interface BookRepository extends JpaRepository<Book, Integer> {

}
