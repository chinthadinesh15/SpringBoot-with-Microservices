package in.Dinesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Dinesh.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>
{
	
}