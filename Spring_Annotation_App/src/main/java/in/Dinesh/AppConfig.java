package in.Dinesh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"in.Dinesh","com.nandyal"})
public class AppConfig 
{
	public AppConfig() 
	{
		System.out.println("AppConfig Constructor..");
	}
	
	@Bean
	public Engine getEngine()
	{
		Engine e =new Engine();
		return e;
	}

}
