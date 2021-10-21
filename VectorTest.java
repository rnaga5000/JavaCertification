package MyPack;
import java.util.*;
/*
 * we can store the values in Vector using 2 ways 
 * 1.add() 2.addElement()
 * equals(),set(),addAll(),for(),contains() 
 *  * 
 */
public class VectorTest 
{

	public static void main(String[] args) 
	{
		Vector<String> v1=new Vector<String>();
		v1.add("Tiger");
		v1.add("Lion");
		v1.add("Elephant");
		v1.add("Dog");
		
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		System.out.println("Printing initial values of V1"+v1);
		
		v1.addElement("Rat");
		v1.addElement("Cat");
		v1.addElement("bat");
		
		System.out.println("Printing values of V1 after adding 3 more values "+v1);
		
		Vector<String> v2=new Vector<String>();
		v2.add("A");
		v2.add("B");
		v2.add("C");
		
		System.out.println("Printing values of V2"+v2);
		System.out.println(v1.equals(v2));
		v1.addAll(v2);
		
		
		System.out.println("Printing values of V1 after adding V2's values "+v1);;
		
		if(v1.contains("Lion"))
		{
			System.out.println("Lion is there in my list");
		}
		else
		{
			System.out.println("Lion is not in the list");
		}
		v1.add(2, "PQR");
		
		System.out.println("Printing values with for each");
		for(String str:v1)
		{
			System.out.println(str);
		}
		System.out.println(v1.get(3));
		String str=v1.get(0);
		str="WWW";
		v1.set(0, str);
		System.out.println(v1);
	}

}
