package MyPack;
import java.util.*;
public class TreeSetDemo 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts=new TreeSet<String>();//generic class
		ts.add("Sachin");
		ts.add("Rohit");
		ts.add("Rishabh");
		ts.add("Sachin");
		
		System.out.println(ts);
		System.out.println("----using for-------");
		for(String temp:ts)
		{
			System.out.println(temp);
		}
		System.out.println("----using Iterator-------");
		Iterator it1=ts.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("----using ArrayList-------");
		ArrayList<String> a1=new ArrayList(ts);
		Collections.sort(a1);
		Iterator it2=ts.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
	}

}
