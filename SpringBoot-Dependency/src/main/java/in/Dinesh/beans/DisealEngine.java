package in.Dinesh.beans;

import org.springframework.stereotype.Component;

@Component

public class DisealEngine  implements IEngine
{
	public DisealEngine() 
	{
		System.out.println("Constructor of Diseal Engine.........");
	}
	@Override
	public int start()
	{
		System.out.println("Diseal Engine Started......");
		return 1;
	}

}
