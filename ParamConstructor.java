package MyPack;

public class ParamConstructor 
{
	public ParamConstructor(int a,int b)
	{
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("-----Swapped Numbers are----- ");
		System.out.println("NO1 "+a);
		System.out.println("NO2 "+b);
	}
	public static void main(String[] args) 
	{
		int x=10,y=20;

		System.out.println("-----Original Numbers are----- ");
		System.out.println("No1 "+x);
		System.out.println("No2 "+y);

		ParamConstructor pc=new ParamConstructor(x,y);
		
	}

}
