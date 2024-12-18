package in.Dinesh.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppExceptionInfo 
{
	private String exCode;
	private String exMsg;
	private LocalDateTime exDate;

}
