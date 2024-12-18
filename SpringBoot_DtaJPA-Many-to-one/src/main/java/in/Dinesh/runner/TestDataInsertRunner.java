package in.Dinesh.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.Dinesh.entity.Department;
import in.Dinesh.entity.Employee;
import in.Dinesh.repository.DepartmentRepository;
import in.Dinesh.repository.EmployeeRepository;

@Component
public class TestDataInsertRunner  implements CommandLineRunner
{
	@Autowired
	private EmployeeRepository erepo;
	
	@Autowired
	private DepartmentRepository drepo;
	

	@Override
	public void run(String... args) throws Exception 
	{
		Department d1 =new Department(10,"Backend");
		Department d2 =new Department(11,"FullSTack");
		Department d3 =new Department(12,"Frontend");
		
		drepo.save(d1);
		drepo.save(d2);
		drepo.save(d3);
		
		Employee e1=new Employee(20,"Dinesh", d1);
		Employee e2=new Employee(21,"Gowtham", d1);
		Employee e3=new Employee(22,"Suresh", d2);
		Employee e4=new Employee(23,"naresh", d2);
		Employee e5=new Employee(24,"venkatesh", d3);
		Employee e6=new Employee(25,"nagarjuna", d3);
		
		erepo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
		
		erepo.fetchEmpNamesByDeptName("Backend").forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		
		erepo.fetchEmpNamesByDeptName().forEach(System.out::println);
	}

}
