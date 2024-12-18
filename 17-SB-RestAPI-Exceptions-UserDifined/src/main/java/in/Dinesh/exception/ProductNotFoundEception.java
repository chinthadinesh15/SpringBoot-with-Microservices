package in.Dinesh.exception;

public class ProductNotFoundEception  extends RuntimeException
{
	public ProductNotFoundEception(String pid) 
	{
		super(pid);
		
	}

}
