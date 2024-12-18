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
		
//		bean.saveEmployee();
//		bean.saveMultipleEmployee();
		
//		bean.getEmp();
		
//		bean.getEmps();
		
//		bean.getMultipleEmployee();
		
//		bean.countEmployees();
//		bean.check();
		
//		bean.deleteEmployee();
		
//		bean.deleteAllEmployee();
		
//		bean.getEmpByDept("sales");
		
//		bean.getEmpByGender("male");
		
//		bean.getEmpSalGreaterThan(40000.0);
		
//		bean.getEmpDeptAndEmpGender("IT", "male");
		
//		bean.customGetAllEmployyee();
		
		bean.customGetParticularDept("IT");
	}

}
