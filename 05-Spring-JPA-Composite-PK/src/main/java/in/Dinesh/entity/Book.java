package in.Dinesh.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Book_info")
public class Book 
{
	private Double price;
	private String authorName;
	
	@EmbeddedId
	private BookPK bookPk;

}
