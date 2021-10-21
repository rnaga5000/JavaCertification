package MyPack;
import java.util.*;
public class DividedByZeroDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int no1,no2,no3=0;
		System.out.println("Enter No1 ");
		no1=sc.nextInt();
		System.out.println("Enter No2 ");
		no2=sc.nextInt();
		try
		{
		no3=no1/no2;
		}
		catch(Exception e)
		{
			System.out.println("Dont Enter No2 as 0 "+e);
		}
		System.out.println("Answer is "+no3);
		
		System.out.println("I am after exception ");
	}

}
