package in.Dinesh.userDefinedException;


public class NoUserFoundException extends RuntimeException
{
	public NoUserFoundException(String pid)
	{
		super(pid);
	}
}
