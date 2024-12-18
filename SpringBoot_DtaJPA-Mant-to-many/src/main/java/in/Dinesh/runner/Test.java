package in.Dinesh.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.Dinesh.entity.Course;
import in.Dinesh.entity.Student;
import in.Dinesh.repository.CourseRepository;
import in.Dinesh.repository.StudentRepository;

@Component
public class Test implements CommandLineRunner
{
	@Autowired
	private CourseRepository crepo;
	
	@Autowired
	private StudentRepository srepo;

	@Override
	public void run(String... args) throws Exception
	{
		Course c1=new Course(10,"java",2000.0);
		Course c2=new Course(11,"C#",4000.0);
		Course c3=new Course(12,"SB",5000.0);
		Course c4=new Course(13,"MS",6000.0);

		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);
		crepo.save(c4);
		
		Student s1=new Student(21,"Dinesh",Set.of(c2,c4));
		Student s2=new Student(22,"Gowtham",Set.of(c1,c2));
		Student s3=new Student(23,"Sathvik",Set.of(c3,c4));
		
		srepo.save(s1);
		srepo.save(s2);
		srepo.save(s3);
		

		//1.The Set.of() is static factory method that creates immutable Set introduced in java 9.
		
	}

}
