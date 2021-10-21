package MyPack;
import java.util.*;
//Stack maintain Last In First Out
public class StackExample 
{
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
			
		System.out.println("Initial Values of Stack"+s);
		
		System.out.println("Retriving value from stack "+s.peek());//retrieve the value

		System.out.println("Remaining values of stack"+s);
		
		System.out.println("Value got poped up"+s.pop());//value is removed  from the stack
		
		System.out.println("Remaining values after pop() "+s.peek());
		
		
		System.out.println("Remaining Values "+s);
		
	}
}
