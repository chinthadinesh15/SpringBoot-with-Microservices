package in.Dinesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Dinesh.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Integer>
{

}
