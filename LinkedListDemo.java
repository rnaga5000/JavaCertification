package MyPack;
import java.util.*;
public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		LinkedList<String> l=new LinkedList<String>();
		System.out.println("Original Size of the LinkedList Object "+l.size());
		l.add("Virendra");
		l.add("Rishabh");
		l.add("Washington");
		l.add("Chahal");
		l.add("Ajinkya");
		System.out.println("Size of the LinkedList Object after adding values "+l.size());
		System.out.println(l);

		System.out.println("------Values in String format ------");
		Iterator it1=l.iterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next()+" ");
		}
		System.out.println("\n ------Values after adding first and last------");
		l.addFirst("Harbhajan");
		l.addLast("Siraj");
		l.add(3,"Umesh");
		Iterator it2=l.iterator();
		while(it2.hasNext())
		{
			System.out.print(it2.next()+" ");
		}
		
		String str=(String)l.get(2);
		str=str+" pant";
		l.set(2, str);
		System.out.println("\n------Values after uoddating------ ");
		Iterator it3=l.iterator();
		while(it3.hasNext())
		{
			System.out.print(it3.next()+" ");
		}
		
		l.remove("Washington");
		
		System.out.println("\n------Values after removing------");
		Iterator it4=l.iterator();
		while(it4.hasNext())
		{
			System.out.print(it4.next()+" ");
		}
		
		Collections.sort(l);
		System.out.println("\n------Values After Sorting------");

		Iterator it5=l.iterator();
		while(it5.hasNext())
		{
			System.out.print(it5.next()+" ");
		}
		
		l.clear();
	}

}
