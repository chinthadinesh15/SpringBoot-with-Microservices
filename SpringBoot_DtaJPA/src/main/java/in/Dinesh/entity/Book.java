package in.Dinesh.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@Component
public class Book
{
	@Id
	private Integer bookId;
	
	private String bookName;
	
	private Double bookPrice;
	

}