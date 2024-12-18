package in.Dinesh.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerWithEmptyData implements CommandLineRunner
{
	@Value("${my.info.emp.id}")
	private int empId;
	
	@Value("${my.info.emp.name}")
	private String empName;
	
	@Value("${my.info.emp.salary}")
	private double salary;
	
	

	@Override
	public String toString() {
		return "RunnerWithEmptyData [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}




	@Override
	public void run(String... args) throws Exception
	{
		System.out.println(this);
	}

}
