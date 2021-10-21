package MyPack;

public class NonStaticVariablesAndMethod
{
	int age=20;
	public void display()
	{
		System.out.println("I am from display");
	}
	public static void main(String[] args) 
	{
		NonStaticVariablesAndMethod n=new NonStaticVariablesAndMethod();
		System.out.println("Age is "+n.age);
		n.display();
	}

}
