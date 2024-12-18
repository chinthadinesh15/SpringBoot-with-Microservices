package in.Dinesh;

public class PetroelEngine implements IEngine
{
	public PetroelEngine() 
	{
		System.out.println("Constructor of Petrol Engine");
	}
	@Override
	public int start() 
	{
		System.out.println("Petroel Engine Started....");
		return 1;
	}

}
