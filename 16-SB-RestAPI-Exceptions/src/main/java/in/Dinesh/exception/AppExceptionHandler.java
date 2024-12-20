package in.Dinesh.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.Dinesh.userDefinedException.NoUserFoundException;

@RestControllerAdvice
public class AppExceptionHandler 
{
	@ExceptionHandler(value=NoUserFoundException.class)
	public ResponseEntity<AppExceptionInfo> handlerUserException(Exception e)
	{
		AppExceptionInfo a=new AppExceptionInfo();
		a.setExCode("USR009");
		a.setExMsg(e.getMessage());
		a.setExDate(LocalDateTime.now());
		return new ResponseEntity<>(a,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<AppExceptionInfo> handlerException(Exception e)
	{
		AppExceptionInfo a=new AppExceptionInfo();
		a.setExCode("SBI009");
		a.setExMsg(e.getMessage());
		a.setExDate(LocalDateTime.now());
		return new ResponseEntity<>(a,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
