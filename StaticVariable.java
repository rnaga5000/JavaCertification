package MyPack;
//if you want to access variable or method inside main() then mark it as static
public class StaticVariable 
{
	static int age=20;
	public static void display()
	{
		System.out.println("I am from display method");
	}
	public static void main(String[] args)
	{
		System.out.println("Age is "+age);
		display();
	}

}
