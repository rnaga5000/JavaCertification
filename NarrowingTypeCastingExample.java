package MyPack;
//it is also called as explicit type casting,develope need to do it
public class NarrowingTypeCastingExample 
{
	public static void main(String args[])  
	{  
	double d = 166.66; //larger data types 
	System.out.println("Original value of Double data type "+d);
	long l=(long)d;
	System.out.println("After convetting Double data type into long data type "+l);
	int i=(int)l;
	System.out.println("Aftee Convetting long data type into int "+i);
	}
}
