package in.Dinesh.Singleton_DesignPattern;

public class Test 
{
	public static void main(String[] args) 
	{
		
//		College c=new College();    // error // private Constructor
//		c.add();
		
		College c=College.get_ref();
		College c1=College.get_ref();
		College c2=College.get_ref();
		
		System.out.println(c +"\n "+c1+"\n"+c2);
		System.out.println(College.get_ref());
		
	}

}
