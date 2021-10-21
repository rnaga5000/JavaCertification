package MyPack;
/*
 * Method Overloading :- this demonstrate static polymorpshim, here values will get bind
 * at the time of compiling the program
 * 
 * 
 */
public class YourDemo 
{
	public void print()
	{
		System.out.println("-----Printing Student's Information ------");
	}
	public void print(int id)
	{
		System.out.println("Student's ID "+id);
	}
	public void print(String name,String address)
	{
		System.out.println("Name "+name);
		System.out.println("Address "+address);
	}
	public void print(char g)
	{
		System.out.println("Gender "+g);
	}
	public static void main(String[] args) 
	{
		YourDemo yd=new YourDemo();
		yd.print();
		yd.print(1);
		yd.print("Virat","India");
		yd.print('m');

		yd.print();
		yd.print(2);
		yd.print("Rohit","India");
		yd.print('m');
		
		yd.print();
		yd.print(3);
		yd.print("Rishbh","India");
		yd.print('m');


		
	}

}
