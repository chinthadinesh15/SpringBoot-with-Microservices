package in.dinesh.repo;

import org.springframework.data.repository.CrudRepository;

import in.dinesh.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
