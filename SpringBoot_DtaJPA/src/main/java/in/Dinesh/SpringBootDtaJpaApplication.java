package in.Dinesh;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Dinesh.entity.Book;
import in.Dinesh.repository.BookRepository;

@SpringBootApplication
public class SpringBootDtaJpaApplication {

	public static void main(String[] args) 
	{
		
		ConfigurableApplicationContext ct=SpringApplication.run(SpringBootDtaJpaApplication.class, args);
		
		BookRepository repo=ct.getBean(BookRepository.class);
		System.out.println(repo.getClass().getName());
		
		//output
		// jdk.proxy2.$Proxy96
		
		Book b=new Book();
		
		b.setBookId(12);
		b.setBookName("Spring");
		b.setBookPrice(101.0);
		
		//repo.save(b);
		
//       Book b2=new Book();
//		
//		b2.setBookId(13);
//		b2.setBookName("Spring");
//		b2.setBookPrice(120.0);
//		//repo.save(b);
//		
//		List<Book> list =new ArrayList<>();
//		list.add(b);
//		list.add(b2);
//		
//		repo.saveAll(list);
		
		
		//select
//		Optional<Book> findbyid=repo.findById(13);
//		System.out.println(findbyid.get());
		
		//existById()
		
		//boolean b1=repo.existsById(11);
		System.out.println(repo.count());
//		
		
		System.out.println("Record Inserted Sucessfully");
	}

}
