package MyPack;
import java.util.*;
//when you mark any class as generic it will get evaluated or checked at compile time
//when you wont mark any class as generic then it will checked at run time
//HashSet<String> hs=new HashSet<String>()
public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<String>();//generic class
		hs.add("Sachin");
		hs.add("Rohit");
		hs.add("Rishabh");
		System.out.println(hs);
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		Iterator it1=hs.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
