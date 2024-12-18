package in.Dinesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="admintab")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admin 
{
	@Id
	@Column(name="aid")
	private Integer adminId;
	
	@Column(name="anmae")
	private String adminName;
	
	@Column(name="acode")
	private String adminCode;
	
}
