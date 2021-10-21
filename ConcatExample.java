package MyPack;

public class ConcatExample 
{
	public static void main(String args[])
	{  
		String s1="java string";  
		System.out.println("Original String "+s1);  
		s1=s1.concat(" is immutable so assign it explicitly");  
		System.out.println("Concatenating String "+s1);  
	}

}
