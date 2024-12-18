
package in.Dinesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="branchtab")
public class Branch
{
	@Id
	@Column(name="bid")
	private Integer bid;
	
	@Column(name="bname")
	private String bname;
	
	@OneToOne
	@JoinColumn(name="aidfk")
	private Admin aob;   //has-a

}
