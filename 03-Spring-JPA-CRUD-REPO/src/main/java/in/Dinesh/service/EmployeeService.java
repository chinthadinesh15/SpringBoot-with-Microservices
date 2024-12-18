package in.Dinesh.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.Dinesh.entity.Employee;
import in.Dinesh.repo.EmployeeRepository;

@Service
public class EmployeeService 
{
	private EmployeeRepository repo;
	
	public EmployeeService(EmployeeRepository repo)
	{
		this.repo=repo;
	}
	
	public void customGetParticularDept(String dept)
	{
		List<Employee> list = repo.getParticularDept(dept);
		list.forEach(System.out::println);
		
	}
	
	public void customGetAllEmployyee()
	{
		List<Employee> list = repo.getAll();
		list.forEach(System.out::println);
	}
	public void getEmpDeptAndEmpGender(String dept,String gender)
	{
		List<Employee> list = repo.findByEmpDeptAndEmpGender(dept, gender);
		list.forEach(System.out::println);
	}
	
	public void getEmpSalGreaterThan(Double sal)
	{
		List<Employee> list = repo.findByEmpSalGreaterThanEqual(sal);
		list.forEach(System.out::println);
	}
	
	public void getEmpByGender(String gender)
	{
		List<Employee> list = repo.findByEmpGender(gender);
		list.forEach(System.out::println);
	}
	
	public void getEmpByDept(String dept)
	{
		List<Employee> list = repo.findByEmpDept(dept);
		list.forEach(System.out::println);
		
	}
	
	public void saveEmployee()
	{
		Employee e=new Employee();
		
		e.setEmpId(101);
		e.setEmpName("Dinesh");
		e.setEmpDept("IT");
		e.setEmpSal(30000.0);
		e.setEmpGender("male");
		
		repo.save(e);
	}
	
	public void saveMultipleEmployee()
	{
		Employee e1=new Employee();
		e1.setEmpId(102);
		e1.setEmpName("Suresh");
		e1.setEmpDept("sales");
		e1.setEmpSal(40000.0);
		e1.setEmpGender("male");
		
		Employee e2=new Employee();
		e2.setEmpId(103);
		e2.setEmpName("sulochana");
		e2.setEmpDept("non-IT");
		e2.setEmpSal(50000.0);
		e2.setEmpGender("fe-male");
		
		List<Employee> list=Arrays.asList(e1,e2);
		repo.saveAll(list);
	}
	
	public void getEmp()
	{
		Optional<Employee> id = repo.findById(101);
		if(id.isPresent())
		{
			Employee employee = id.get();
			System.out.println(employee);
		}
	}
	
	public void getEmps()
	{
		List<Integer> list = Arrays.asList(101,102);
		Iterable<Employee> id = repo.findAllById(list);
		id.forEach(System.out::println);
	}
	
	public void getMultipleEmployee()
	{
		Iterable<Employee> list = repo.findAll();
		list.forEach(System.out::println);
	}
	
	public void countEmployees()
	{
		long count = repo.count();
		System.out.println(count);
	}
	
	public void check()
	{
		boolean existsById = repo.existsById(102);
		System.out.println(existsById);
	}
	
	public void deleteEmployee()
	{
		repo.deleteById(103);
	}
	
	public void deleteAllEmployee()
	{
		List<Integer> list = Arrays.asList(101,102);
		repo.deleteAllById(list);
	}
	
	public void deleteObject()
	{
		repo.delete(null);
	}


}