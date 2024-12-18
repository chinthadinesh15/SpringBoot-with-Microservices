package in.dinesh;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertObjectToJSON 
{
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException 
	{
		Customer c=new Customer(101,"dinesh","chinthadineshbabu15@gmail.com");
		
		//convert obj to JSON
		
		ObjectMapper mapper=new ObjectMapper();
		
		mapper.writeValue(new File("customer.json"), c);
		
		System.out.println("Completed......");
		
		
	}

}
