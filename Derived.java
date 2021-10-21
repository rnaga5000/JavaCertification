package MyPack;
/*single inheritance means we are creating a new class by
by inheriting variables and methods from existing class 
to new class.
*/
class Base
{
	int id;
	String name;
	String address;
}
public class Derived extends Base
{
	int mobile;
		public static void main(String args[])
		{
			Derived d=new Derived();
			d.id=101;
			d.name="XYZ";
			d.mobile=123456;
			System.out.println("ID "+d.id);
			System.out.println("Name "+d.name);
			System.out.println("Mobile "+d.mobile);
		}
}
