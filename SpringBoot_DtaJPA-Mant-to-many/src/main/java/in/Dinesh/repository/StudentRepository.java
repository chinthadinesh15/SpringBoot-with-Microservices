package in.Dinesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Dinesh.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>
{
	

}
