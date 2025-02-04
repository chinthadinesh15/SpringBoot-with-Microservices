package in.Dinesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Dinesh.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeService bean = context.getBean(EmployeeService.class);
		
//		bean.getEmpWithSort("empName");
		
//		bean.getEmpWithPaggination(3,1);
		
//		bean.getEmpsByQBE();
		
//		bean.saveEmployee();
		
//		bean.saveEmployees();
		
//		bean.getEmp();
//		bean.getEmps();
		
//		bean.getAllEmp();
		
//		bean.check();
		
//		bean.count();
		
//		bean.deleteWithId();
		
//		bean.deleteEmployees();
		
		
//		bean.getEmpWithSort("empName");
		
		bean.getEmpWithPaggination(3,1);
	}

}
