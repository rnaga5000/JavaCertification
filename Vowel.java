package MyPack;

import java.util.Scanner;

public class Vowel 
{

	public static void main(String[] args)
	{
		String str;
		System.out.println("Enter Any Character ");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		if(str.charAt(0)=='A' || str.charAt(0)=='E' || str.charAt(0)=='I' || str.charAt(0)=='O' || str.charAt(0)=='U')
		{
			System.out.println("Charater is Vowel");
		}
		else
		{
			System.out.println("Character is not a Vowel");
		}
		
	}

}
