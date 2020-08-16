package project.selfefd.restcontroller;

public class Singleton
{
	static Singleton obj = null;
	private Object getInstan()
	{
		if (obj == null)
		{
			obj= new Singleton();
			return obj;
		}
		else
		{
			return obj;
		}
	}
	
	public static void main(String args[])
	{
		Singleton s = new Singleton();
		s.getInstan();
	}
	
}
