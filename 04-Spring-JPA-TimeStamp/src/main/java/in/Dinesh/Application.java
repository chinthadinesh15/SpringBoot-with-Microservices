package in.Dinesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Dinesh.entity.ContactUsEntity;
import in.Dinesh.repo.ContactUsRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ContactUsRepo bean = context.getBean(ContactUsRepo.class);
		
		ContactUsEntity entity=new ContactUsEntity();
		entity.setId(1);
		entity.setCname("Dinesh");
		entity.setCphno("6300151569");
		entity.setCemail("chinthadineshbabu15@gmail.com");
		
		bean.save(entity);
	}

}
