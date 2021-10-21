package MyPack;
/*constructor is a special method which have same as class,it dont have 
 * return type and modifier also,it dosen't return a value,it is used to
 * create object of the class.
 * constructor is of 2 types 1) default constructor 2) Parameterized 
*/
public class UseOfStatic 
{
	static int counter=10;
	public UseOfStatic()//constructor
	{
		System.out.println(counter);//10 11 12
		counter++;
	}
	public static void main(String[] args) 
	{
		UseOfStatic u1=new UseOfStatic();//10
		UseOfStatic u2=new UseOfStatic();
		UseOfStatic u3=new UseOfStatic();
		System.out.println(UseOfStatic.counter);
	}
}
/*	UseOfStatic u=new UseOfStatic();
	UseOfStatic :- it is the class name
 *  u :- it is the object name 
 *  new :- memory allocation operator
 *  UseOfStatic() :- calling a constructor
	
 * */
