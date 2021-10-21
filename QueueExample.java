package MyPack;
import java.util.*;
//Queue maintain first in first out
public class QueueExample 
{
	public static void main(String[] args) 
	{
		Queue queue=new LinkedList();
		queue.add("Hello");
		queue.add("Hello");
		queue.add("World");

System.out.println("Value of Queue Implemented in LinkedList "+queue);

		List lst=new ArrayList(queue);
		System.out.println(lst);

		Set s1=new HashSet(queue);
		System.out.println(s1);
		
		Set s=new HashSet(lst);
		System.out.println(s);

		System.out.println(queue);

	}

}
