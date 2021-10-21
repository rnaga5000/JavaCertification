package MyPack;
import java.util.*;
public class SwapDemo 
{
	int n1,n2,n3;
	public SwapDemo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No1 ");
		n1=sc.nextInt();
		System.out.println("Enter No2 ");
		n2=sc.nextInt();
		System.out.println("----Original Numbers are ----");
		System.out.println("No1 "+n1);
		System.out.println("No2 "+n2);
	}
	public void swap()
	{
		n3=n1;//12
		n1=n2;//23
		n2=n3;//12
		System.out.println("----Values After Swapping----");
		System.out.println("No1 "+n1);
		System.out.println("No2 "+n2);
	}
	public static void main(String[] args) 
	{
		SwapDemo s=new SwapDemo();
		s.swap();
	}

}
