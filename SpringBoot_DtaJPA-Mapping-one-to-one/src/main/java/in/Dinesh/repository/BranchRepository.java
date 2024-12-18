package in.Dinesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Dinesh.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch,Integer> 
{
	

}
