package MyPack;

import java.util.Scanner;

public class ArithmaticOperator {

	public static void main(String[] args) 
	{
		int a,b,c;
		String str;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No1 ");
		a=sc.nextInt();//first value will be accepted in string format and later nextInt() will convert into int
		System.out.println("Enter No2 ");
		b=sc.nextInt();
		System.out.println("+.Addition\n-.Subtraction\n*.Multiplication\n //Division");
		System.out.println("Enter Your Operator +,-,*,/");
		str=sc.next();//it will accept the value in string
		ch=str.charAt(0);
		switch(ch)
		{
		case '+' :	c=a+b;
					System.out.println("Addition is "+c);
					break;
		case '-':	c=a-b;
					System.out.println("Subtraction is "+c);
					break;
		case '*':	c=a/b;
					System.out.println("Division is "+c);
					break;
		case '/':
					break;
		default :System.out.println("Check your operator ");
					
		}
		
	}

}
