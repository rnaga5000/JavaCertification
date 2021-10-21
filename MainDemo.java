package MyPack;
/*
 * function overloading demonstrate static polymorphism, where we need to folow
 * some guidelines
 * 1.you must have same function more than once
 * 2.you should change number of parameters
 * 3. if you want to keep number of parameters same then 
 * change their data types.
 */
public class MainDemo 
{

	public static void main(String[] args) 
	{
		System.out.println("String....");
	}
	public static void main(int args[])
	{
		System.out.println("int ....");
	}
	public static void main(double args[])
	{
		System.out.println("double ....");
	}
	public static void main(long args[])
	{
		System.out.println("long ....");
	}
	public static void main(char args[])
	{
		System.out.println("char....");
	}
}
