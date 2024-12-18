package in.Dinesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Dinesh.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>
{
	

}
