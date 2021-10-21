package MyPack;
import java.util.*;
public class OccurenceOfA 
{

	public static void main(String[] args) 
	{
		int counter=0;
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter a Name ");
		str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='A')
			{
				counter++;
			}
		}
		System.out.println("A is occred "+counter+" times" );
	}

}
