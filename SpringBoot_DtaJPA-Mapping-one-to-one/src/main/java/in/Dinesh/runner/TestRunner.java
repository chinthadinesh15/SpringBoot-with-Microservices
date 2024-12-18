package in.Dinesh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.Dinesh.entity.Admin;
import in.Dinesh.entity.Branch;
import in.Dinesh.repository.AdminRepository;
import in.Dinesh.repository.BranchRepository;

@Component
public class TestRunner implements CommandLineRunner 
{
	@Autowired
	private AdminRepository arepo;
	
	@Autowired
	private BranchRepository brepo;
	
	
	@Override
	public void run(String... args) throws Exception 
	{
		Admin a1=new Admin(10,"Dinesh","AP121");
		Admin a2=new Admin(11,"Gowtham","AP121");
		
		arepo.save(a1);
		arepo.save(a2);
		
		Branch b1=new Branch(28,"Dev",a1);
		Branch b2=new Branch(29,"Testing",a2);
		
		brepo.save(b1);
		brepo.save(b2);

		
	}

}
