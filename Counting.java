package MyPack;
/*accept a sentence from user and find out below things
upper case,lower case,number,special char,paces
ASCII :- American Standard code for information interchange
*/
import java.util.*;
public class Counting 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str;
		int u=0,l=0,n=0,sp=0,spc=0;
		System.out.println("Enter a Sentence ");
		str=sc.nextLine();
		//I am happy to Take your session @ 18/9/21
		System.out.println("Number of characters in Sentence "+str.length());
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				u++;
			}
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				l++;
			}
			if(str.charAt(i)==32)
			{
				sp++;
			}
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				n++;
			}
			if(str.charAt(i)>=33 && str.charAt(i)<=47 || str.charAt(i)==64)
			{
				spc++;
			}
		}
		System.out.println("# of Capital Letters "+u);
		System.out.println("# of Small Letters "+l);
		System.out.println("Total Numbers "+n);
		System.out.println("# of Spaces "+sp);
		System.out.println("# of Special Characters "+spc);
		
		
		
		
	}

}
