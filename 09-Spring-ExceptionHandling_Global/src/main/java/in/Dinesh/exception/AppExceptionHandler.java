package in.Dinesh.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler
{
	@ExceptionHandler(value=Exception.class)
	public String handledException(Exception e)
	{
		//System.out.print(e.printStackTrace());
		
		return "errorView";
		
	}
}
