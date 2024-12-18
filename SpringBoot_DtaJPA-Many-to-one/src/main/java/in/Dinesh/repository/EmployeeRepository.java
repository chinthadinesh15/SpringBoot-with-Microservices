package in.Dinesh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.Dinesh.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	
    @Query("select e.empName from Employee e LEFT JOIN e.dob  as dept where dept.deptName= :dname")
	List<String> fetchEmpNamesByDeptName(String dname);
	
    @Query("select e.empName from Employee e LEFT JOIN e.dob  as dept")
	List<String> fetchEmpNamesByDeptName();

}
