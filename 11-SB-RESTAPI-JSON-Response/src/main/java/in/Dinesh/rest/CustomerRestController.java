package in.Dinesh.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Dinesh.binding.Customer;

@RestController
public class CustomerRestController 
{
	@DeleteMapping(value="/customer/{cId}",produces="text/plain")
	public String deleteCustomer(@PathVariable Integer cId)
	{
		//db
		
		return"Customer Deleted";
	}
	
	@PutMapping(value="/customer",produces="text/plain",consumes="application/json")
	public String updateCustomer(@RequestBody Customer c)
	{
		System.out.println(c);
		return"Customer Data is Updated...";
	}
	
	@PostMapping(value="/customer",produces="text/plain",consumes="application/json")
	public ResponseEntity<String> addCustomer(@RequestBody Customer c)
	{
		System.out.println(c);
		String body="Customer Data is Updated";
		return new ResponseEntity<>(body,HttpStatus.CREATED);
	}
	
	@GetMapping( value="/customer" ,produces="application/json")
	public Customer getCustomer()
	{
		//get it from db
		
		Customer c=new Customer(101,"Dinesh","dinesh@gmail.com");
		
		return c;
	}
	
	@GetMapping(value="/customers",produces="application/json")
	public List<Customer> getCustomers()
	{
		Customer c1=new Customer(101,"Dinesh","dinesh@gmail.com");
		Customer c2=new Customer(102,"Gowtham","Gowtham@gmail.com");
		Customer c3=new Customer(103,"Naresh","Naresh@gmail.com");
		
		List<Customer> customers = Arrays.asList(c1,c2,c3);
		
		return customers;
	}

}
