package in.Dinesh.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler 
{
	@ExceptionHandler(value=ProductNotFoundEception.class)
   public ResponseEntity<AppExInfo> handleEx(Exception e)
   {
		AppExInfo a=new AppExInfo("SBIEX009",e.getMessage(),LocalDateTime.now());
		
		return new ResponseEntity<>(a,HttpStatus.INTERNAL_SERVER_ERROR);
		
   }
}
