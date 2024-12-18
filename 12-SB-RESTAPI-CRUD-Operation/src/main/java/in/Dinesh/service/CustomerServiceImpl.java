package in.Dinesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Dinesh.binding.Customer;
import in.Dinesh.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService 
{
	@Autowired
	private CustomerRepository repo;

	@Override
	public String upsert(Customer customer) 
	{
		repo.save(customer);
		return "Success";
	}

	@Override
	public Customer getById(Integer cid) 
	{
		Optional<Customer> id = repo.findById(cid);
		
		if(id.isPresent())
		{
			return id.get();
		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() 
	{
		return repo.findAll();
		
	}

	@Override
	public String deleteById(Integer cid)
	{
		if(repo.existsById(cid))
		{
			repo.deleteById(cid);
			return "Success";
		}
		else
		{
			return "No record Found";
		}
	}

}
