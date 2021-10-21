package MyPack;

public class ArrayIndexOutBoundsDemo
{

	public static void main(String[] args) 
	{
		int arr1[]={1,2,3,4,5};
		try
		{
			for (int i=0;i<arr1.length;i++)
			{
				System.out.println(arr1[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("Please check length of an array");
		}
		finally
		{
			System.out.println("I will execute always ");
		}
		System.out.println("I am after exception");
	}

}
