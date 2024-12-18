package in.Dinesh;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Dinesh.entity.Employee;
import in.Dinesh.repository.EmployeeRepository;

@SpringBootApplication
public class Application
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ct=SpringApplication.run(Application.class, args);
		EmployeeRepository repo=ct.getBean(EmployeeRepository.class);
		
		
		// insert and update
//		Employee e=new Employee();
//		e.setEmpId(1);
//		e.setEmpName("Dinesh");
//		e.setEmpSalary(3000.0);
//		e.setDept("it");
//		e.setEmpGender("male");
//		
//		repo.save(e);
		
		//saveAll(Iterator)
//		Employee e=new Employee();
//		e.setEmpId(2);
//		e.setEmpName("Gowtham");
//		e.setEmpSalary(300.0);
//		e.setDept("it");
//		e.setEmpGender("male");
//		
//		Employee e1=new Employee();
//		e1.setEmpId(3);
//		e1.setEmpName("Sulochana");
//		e1.setEmpSalary(5000.0);
//		e1.setDept("sales");
//		e1.setEmpGender("female");
//		
//		List<Employee> l1=new ArrayList<>();
//		
//		l1.add(e);
//		l1.add(e1);
//		
//		
//		repo.saveAll(l1);
		
//		 Optional<Employee> op=repo.findById(2);
//		 
//		 if(op.isPresent())
//		 {
//			 System.out.println(op.get());
//		 }
//		
//		
	//List<Employee>	list=repo.findByEmpSalaryGreaterThan(100.0);
	//list.forEach(System.out::println);
		
		
		
		
	}

}
