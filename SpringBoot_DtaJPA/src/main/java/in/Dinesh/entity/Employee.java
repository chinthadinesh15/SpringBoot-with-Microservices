package in.Dinesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="empTab")
public class Employee 
{
	@Id
	@Column(name="eid")
	private Integer empId;  // emp_id
	
	@Column(name="ename")   
	private String empName;  //emp_name
	
	@Column(name="esal")
	private Double empSalary;  //emp_salary
	
	@Column(name="edept")
	private String empDept;
	
	@Column(name="eadd")
	private String empAdd;

}
