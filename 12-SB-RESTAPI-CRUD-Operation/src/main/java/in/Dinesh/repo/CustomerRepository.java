package in.Dinesh.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.Dinesh.binding.Customer;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Serializable>
{

}
