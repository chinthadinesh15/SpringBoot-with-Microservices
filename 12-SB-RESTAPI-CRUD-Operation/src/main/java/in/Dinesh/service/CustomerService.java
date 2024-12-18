package in.Dinesh.service;

import java.util.List;

import in.Dinesh.binding.Customer;

public interface CustomerService 
{
	public String upsert(Customer customer);
	public Customer getById(Integer cid);
	public List<Customer> getAllCustomers();
	public String deleteById(Integer cid);

}
