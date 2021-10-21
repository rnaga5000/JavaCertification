package MyPack;
import java.util.*;
class MyException extends Exception
{
	public MyException()
	{
		System.out.println("Cannot withdraw Amount");
	}
}
public class UserDefinedException 
{

	public static void main(String[] args) 
	{
		int balance=5000;
		int w=0;
		int fm=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Withdrawal Amount");
		w=sc.nextInt();
		fm=balance-w;
		try
		{
			if(fm<1000)
			{
				throw new MyException();
			}
			else
			{
				System.out.println("Balance "+fm);
			}
		}
		catch(Exception e)
		{
			System.out.println("Minimum Rs.1000 is required ");
		}
	}

}
