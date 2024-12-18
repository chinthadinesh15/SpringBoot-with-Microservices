package in.Dinesh.runner;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.Dinesh.entity.Model;
import in.Dinesh.entity.Product;
import in.Dinesh.repository.ModelRepository;
import in.Dinesh.repository.ProductRepository;

@Component
public class DataInsertRunner  implements CommandLineRunner
{
	@Autowired
	private ModelRepository mrepo;
	
	@Autowired
	private ProductRepository prepo;

	@Override
	public void run(String... args) throws Exception 
	{
		Model m1=new Model(20,"Dell-i");
		Model m2=new Model(21,"Dell-v");
		
		mrepo.save(m1);
		mrepo.save(m2);
		
		Set<Model> s1=new HashSet<>();
		
		s1.add(m1);
		s1.add(m2);
		
		Product p1=new Product(10,"Dell-laptop",s1);
		
		prepo.save(p1);
		
	}

}
