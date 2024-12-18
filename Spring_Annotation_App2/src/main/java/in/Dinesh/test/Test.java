package in.Dinesh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.Dinesh.AppConfig;
import in.Dinesh.beans.ReportService;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService service = ac.getBean(ReportService.class);
		service.generateReport();
	}

}
