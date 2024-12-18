package in.Dinesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Dinesh.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer>
{
	

}
