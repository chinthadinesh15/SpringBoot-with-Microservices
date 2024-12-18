package in.Dinesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="modeltab")
public class Model
{
	@Id
	@Column(name="mid")
	private Integer modeId;
	
	@Column(name="mname")
	private String modeName;

}
