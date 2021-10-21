package MyPack;
import java.util.*;
public class ConstructoAndMethod 
{
	int num;
	int a,b,c;
	public ConstructoAndMethod()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two digit Number ");
		num=sc.nextInt();//23
	}
	public void print()
	{
		a=num/10;//2
		b=num%10;//3
		c=a+b;//2+3
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		ConstructoAndMethod c1=new ConstructoAndMethod();
		c1.print();
		System.out.print(new Date());
	}

}
