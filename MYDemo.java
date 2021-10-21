package MyPack;
/*
 * Constructor Overloading is demonstrate dynamic polymorphism.
 * following are few conditions which we need to follow
 * 1.we must have more than 1 constructor
 * 2.we should change number of parameters in each cconstructor
 * 3.if number of parmeters are same then change their datatype
 * 
 * difference between Method Overloading and Constructor Overloading
 * 1. Method overloading (while compiling the program)
 * 2. Constructor overloading (While running the program)
 */
public class MYDemo 
{
	public MYDemo()
	{
		System.out.println("-----Printing Employee Information-------");
	}
	public MYDemo(int empno)
	{
		System.out.println("Employee No "+empno);
	}
	public MYDemo(String name,String Address)
	{
		System.out.println("Employee Name "+name);
		System.out.println("Empoyee Address "+Address);
	}
	public MYDemo(char g)
	{
		System.out.println("Gender "+g);
	}
	public static void main(String[] args) 
	{
		MYDemo m1=new MYDemo();
		MYDemo m2=new MYDemo(101);
		MYDemo m3=new MYDemo("Sachin","India");
		MYDemo m4=new MYDemo('m');
	}

}
