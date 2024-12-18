package in.Dinesh.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.Dinesh.AppConfig;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
	}

}
