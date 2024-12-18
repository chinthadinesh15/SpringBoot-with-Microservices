package in.Dinesh.binding;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book 
{
	private Integer bookId;
	private String bookName;
	private Double bookPrice;

}
