package MyPack;
//if you declare a variable as final then you cannot reinitailize it in further program
public class FinalVariable {

	public static void main(String[] args) 
	{
		int a=10;//variable
		final int b=100;//final variable
		System.out.println(a);
		System.out.println(b);
		a=20;
		System.out.println(a);
	}

}
