package MyPack;

import java.util.Scanner;

public class MultipleCapital {

	public static void main(String[] args) 
	{
		int num;//it is the int variable,accept only number
		String ch;
		do
		{
		System.out.println("1.India\n2.Australia\n3.Srilanka\n4.Japan");
		Scanner sc=new Scanner(System.in);//it is used accept the input
		System.out.println("Enter Your Choice between 1 to 4 ");
		num=sc.nextInt();//it is accepting value and converting it into int
		switch(num)
		{
		case 1:System.out.println("\nCapital of India is Delhi!");
				break;
		case 2:System.out.println("\nCapital of Australia is sCanbera!");
				break;
		case 3:System.out.println("\nCapital of Srilanka is Colombo!");
				break;
		case 4:System.out.println("\nCapital of Japan is Tokyo!");
				break;
		default :System.out.println("Please check the input");
		}
		System.out.println("Do You want to continue(yes/no)");
		ch=sc.next();
		}while(ch.equals("yes"));
	}
}
