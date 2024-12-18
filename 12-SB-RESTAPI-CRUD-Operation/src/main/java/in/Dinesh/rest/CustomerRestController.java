package in.Dinesh.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import in.Dinesh.service.CustomerService;

@RestController
public class CustomerRestController 
{
	@Autowired
	private CustomerService serviceRepo;
	
	@DeleteMapping(value="/customer/{cId}",produces="text/plain")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer cId)
	{
		 String id = serviceRepo.deleteById(cId);
		return new ResponseEntity<>(id,HttpStatus.OK);
	}
	
	@PutMapping(value="/customer",produces="text/plain",consumes="application/json")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer cid)
	{
		String status = serviceRepo.upsert(cid);
		return new ResponseEntity<>(status,HttpStatus.OK); 
	}
	
	@PostMapping(value="/customer",produces="text/plain",consumes="application/json")
	public ResponseEntity<String> addCustomer(@RequestBody Customer cid)
	{
		String status = serviceRepo.upsert(cid);
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	
	@GetMapping( value="/customer/{cid}" ,produces="application/json")
	public ResponseEntity<Customer> getCustomer(@PathVariable Integer cid)
	{
		Customer id = serviceRepo.getById(cid);
		
		return new ResponseEntity<>(id,HttpStatus.OK);
	}
	
	@GetMapping(value="/customers",produces="application/json")
	public ResponseEntity< List<Customer>> getAllCustomers()
	{
		List<Customer> allCustomers = serviceRepo.getAllCustomers();
		
		return new ResponseEntity<>(allCustomers,HttpStatus.OK);
	}

}
