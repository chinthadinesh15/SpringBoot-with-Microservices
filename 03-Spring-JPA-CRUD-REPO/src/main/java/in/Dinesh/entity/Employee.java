package in.Dinesh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
	@Id
	private Integer empId;
	private String empName;
	private String empDept;
	private Double empSal;
	private String empGender;

}