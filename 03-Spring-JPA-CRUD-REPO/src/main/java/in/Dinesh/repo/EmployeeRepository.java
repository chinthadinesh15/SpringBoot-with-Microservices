package in.Dinesh.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.Dinesh.entity.Employee;

public interface EmployeeRepository  extends CrudRepository<Employee, Integer>
{
//	findBy()
	
	public List<Employee> findByEmpDept(String dept);
	
	public List<Employee> findByEmpGender(String gender);
	
	public List<Employee> findByEmpSalGreaterThanEqual(Double sal);
	
	public List<Employee> findByEmpDeptAndEmpGender(String dept,String gender);
	
	@Query("from Employee")
	public List<Employee> getAll();
	
	@Query("from Employee where empDept=:dept")
	public List<Employee> getParticularDept(String dept);
}