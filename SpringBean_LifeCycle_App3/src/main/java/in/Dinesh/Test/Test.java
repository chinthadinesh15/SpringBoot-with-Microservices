package in.Dinesh.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.Dinesh.AppConfig;
import in.Dinesh.dao.UserDao;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		UserDao dao=ac.getBean(UserDao.class);
		dao.getData();
		
		ConfigurableApplicationContext cp=(ConfigurableApplicationContext) ac;
		cp.close();
	}

}
