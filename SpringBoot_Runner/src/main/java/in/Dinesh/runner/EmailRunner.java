package in.Dinesh.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailRunner implements ApplicationRunner
{
	@Override
	public void run(ApplicationArguments args) throws Exception
	{
		System.out.println("Application runner Run Method");
	}
	
}