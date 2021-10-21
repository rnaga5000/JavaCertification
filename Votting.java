package MyPack;

import java.util.Scanner;

//accept age from user and display message whether he / she able to 
//vote or not 
public class Votting 
{

	public static void main(String[] args)
	{
		int age;//age is a variable which will accept numerical data
		System.out.println("Enter Your Age ");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();//convert your input into int / number
		if(age>=18)
		{
			System.out.println("You can Vote!");
		}
		else
		{
			System.out.println("You can not Vote!");
		}
	}

}
