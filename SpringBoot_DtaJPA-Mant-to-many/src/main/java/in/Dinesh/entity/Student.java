package in.Dinesh.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="stdtab")
public class Student 
{
	@Id
	@Column(name="sid")
	private Integer stdId;
	
	@Column(name="sname")
	private String stdName;
	
	@ManyToMany
	@JoinTable(
			 name ="stdcrstab",
			 joinColumns = @JoinColumn(name="sidFK"),
			 inverseJoinColumns = @JoinColumn(name="cidFK"))
	private Set<Course> cobs;
	
	
	//1.@JoinTable: customize the association table that holds the relationships between two entities in a many-to-many relationship.
	//2.use the @joinColumn annotation within joinColumns to define the foreign key Column(s).
	//3.Specifies the foreign key column(s) from the owning entity to the join table.
	//4.Specifies the foreign key column(s) from the inverse entity to the join table.
	

}
