package MyPack;

public class NullPointerExceptionDemo 
{
	public void print()
	{
		System.out.println("@@@@");
	}
	public static void main(String[] args) 
	{
		try
		{
			NullPointerExceptionDemo n=null;
			n.print();
		}
		catch(Exception e)
		{
			System.out.println("$$$$$$");
		}
	}

}
