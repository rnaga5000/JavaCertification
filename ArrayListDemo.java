package MyPack;
import java.util.*;//all collection classes and interfaces
/*
 * add():- it is used to add the values in ArrayList Object
 * size():-it is used to find out how many values are stored in object
 * remove():- it will remove the value from the list
 * get():-it is used to retrieve the value
 * sort():- it is used to sort the values as per ascending order (A-Z)
 * clear():-it is used to remove all values from the list
 */
public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		System.out.println("Size of the ArrayList object is "+a.size());
		a.add("Sachin");
		a.add("Virat");
		a.add("Saurav");
		a.add("Rohit");
		a.add("Rohit");
		System.out.println("Size of the ArrayList object After adding values is "+a.size());
		System.out.println("Values in Object Format "+a);
		Iterator it1=a.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		a.add(2,"Hardik");
		System.out.println("Values in String Format ");
		Iterator it2=a.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
		String str1=(String)a.get(1);
		str1=str1+" Kohli";
		a.set(1,str1);

		System.out.println("Values in String Format after changin 1st index");
		Iterator it3=a.iterator();
		while(it3.hasNext())
		{
			System.out.println(it3.next());
		}

		a.remove(5);
		System.out.println("Values in String Format after Removing Rohit from 5th index ");
		Iterator it4=a.iterator();
		while(it4.hasNext())
		{
			System.out.println(it4.next());
		}
		
		Collections.sort(a);
		System.out.println("Values in String Format after sorting");
		Iterator it5=a.iterator();
		while(it5.hasNext())
		{
			System.out.println(it5.next());
		}
		
		a.clear();
		System.out.println(a);
	}

}
