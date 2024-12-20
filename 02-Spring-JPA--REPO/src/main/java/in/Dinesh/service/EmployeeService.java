package in.Dinesh.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	
	public void getEmpWithSort(String column)
	{
		Sort by=Sort.by(column);
		List<Employee> e=repo.findAll(by);
		e.forEach(System.out::println);
	}
	
	public void getEmpWithPaggination(int pageSize,int pageNum)
	{
		PageRequest of=PageRequest.of(pageNum-1, pageSize);
		Page<Employee> page = repo.findAll(of);
		List<Employee> list=page.getContent();
		list.forEach(System.out::println);
	}
	
	
	
	public void getEmpsByQBE()
	{
		Employee e=new Employee();
		
		e.setEmpGender("fe-male");
		
		Example<Employee> of = Example.of(e);
		List<Employee> list = repo.findAll(of);
		list.forEach(System.out::println);
	}
	
	public void saveEmployee()
	{
		Employee e=new Employee();
		e.setEmpId(109);
		e.setEmpName("Naresh");
		e.setEmpDept("IT");
		e.setEmpGender("Male");
		e.setEmpSal(70000.0);
		
		repo.save(e);
	}
	
	public void saveEmployees()
	{
		Employee e1=new Employee();
		e1.setEmpId(110);
		e1.setEmpName("Bhavya");
		e1.setEmpDept("IT");
		e1.setEmpGender("fe-male");
		e1.setEmpSal(45000.0);
		
		Employee e2=new Employee();
		e2.setEmpId(111);
		e2.setEmpName("Bhavya Sree");
		e2.setEmpDept("IT");
		e2.setEmpGender("fe-male");
		e2.setEmpSal(35000.0);
		
		List<Employee> list=Arrays.asList(e1,e2);
		
		repo.saveAll(list);
	}
	
	public void getEmp()
	{
		Optional<Employee> list=repo.findById(110);
		
		if(list.isPresent())
		{
			Employee e=list.get();
			System.out.println(e);
		}
	}
	
	public void getEmps()
	{
		List<Integer> list=Arrays.asList(110,111);
		
		Iterable<Employee> op=repo.findAllById(list);
		
		op.forEach(System.out::println);
	}
	
	public void getAllEmp()
	{
		Iterable<Employee> list=repo.findAll();
		list.forEach(System.out::println);
	}
	
	public void check()
	{
		boolean id = repo.existsById(110);
		System.out.println(id);
	}
	
	public void count()
	{
		long l = repo.count();
		System.out.println(l);
	}
	
	public void deleteWithId()
	{
		repo.deleteById(111);
	}
	public void deleteEmployees()
	{
		List<Integer> asList = Arrays.asList(109,110);
		repo.deleteAllById(asList);
	}
	
}