package in.Dinesh.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PetroelEngine implements IEngine
{
	public PetroelEngine() 
	{
		System.out.println("Constructor of Petroel Engine..........");
	}
	@Override
	public int start()
	{
		System.out.println("Petroel Engine is Strated......");
		return 1;
	}

}
