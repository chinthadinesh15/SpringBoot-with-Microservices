package in.Dinesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Dinesh.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{

}
