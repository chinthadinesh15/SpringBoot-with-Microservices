package in.Dinesh.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DataRestController 
{
	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataFromDB", name = "dinesh")
	public String getDataFromRadis()
	{
		System.out.println("Radis Method Called...........");
		
		int i=11/0;
		
		return "Redis Data Send";
	}
	
	public String getDataFromDB(Throwable t)
	{
		System.out.println("DB Method is calledd......");
		
		return "Db Data Send";
	}

}
