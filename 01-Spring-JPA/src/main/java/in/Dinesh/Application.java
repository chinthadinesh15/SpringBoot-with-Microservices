package in.Dinesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Dinesh.entity.Book;
import in.Dinesh.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		BookRepository bean = context.getBean(BookRepository.class);
		
		Book b=new Book();
		b.setBookId(1);
		b.setBookName("JAVA");
		b.setPrice(500);
		
		
		
		Book b1=new Book();
		b1.setBookId(2);
		b1.setBookName("Python");
		b1.setPrice(6000);
		
		
		
		
		
		
		
	}
}
