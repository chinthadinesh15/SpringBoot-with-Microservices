package in.Dinesh.beans;

public class PetroelEngine implements IEngine
{
	public PetroelEngine() 
	{
		System.out.println("Constructoorof Petrol Engine");
	}
	@Override
	public int start() 
	{
		System.out.println("Petroel Engine STarted....");
		return 1;
	}

}
