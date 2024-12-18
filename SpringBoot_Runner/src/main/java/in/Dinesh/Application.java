package in.Dinesh;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application 
{
	public static void main(String[] args) 
	{
		System.out.println("Inside the starter Class");
		ConfigurableApplicationContext ca=SpringApplication.run(Application.class, args);
	}

}
