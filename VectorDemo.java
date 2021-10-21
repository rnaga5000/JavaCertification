package MyPack;
import java.util.*;
/*
 * size():- it is used to print the initial size(values) of vector
 * capacity():- default capacity of vector
 * addElement():- it is used store values
 * firstElement():-it is used to fetched 1st value
 * lastElement():- it is used to fetched last value of the vector
 * 
 * while creating vector we have to pass 2 parameters as 
 * 1. initial capacity  
 * 2. after initial values got completed by how much numbers vector shuld grow
 * 
 * 
 */
public class VectorDemo 
{

	public static void main(String[] args) 
	{
	      Vector v = new Vector(3, 2);
	      System.out.println("Initial size: " + v.size());
	      System.out.println("Initial capacity: " + v.capacity());
	      
	      v.addElement(new Integer(1));
	      v.addElement(new Integer(2));
	      v.addElement(new Integer(3));
	      v.addElement(new Integer(4));
	      System.out.println("Capacity after four additions: " + v.capacity());

	      v.addElement(new Double(5.45));
	      System.out.println("Current capacity: " + v.capacity());
	      
	      v.addElement(new Double(6.08));
	      v.addElement(new Integer(7));
	      System.out.println("Current capacity: " + v.capacity());
	      
	      v.addElement(new Float(9.4));
	      v.addElement(new Integer(10));
	      System.out.println("Current capacity: " + v.capacity());
	      
	      v.addElement(new Integer(11));
	      v.addElement(new Integer(12));
	      System.out.println("First element: " + (Integer)v.firstElement());
	      System.out.println("Last element: " + (Integer)v.lastElement());
	      
	      if(v.contains(new Integer(3)))
	         System.out.println("Vector contains 3.");
	         
	      v.set(0,1200);
	      System.out.println("First element: " + (Integer)v.firstElement());
	      System.out.println("Last element: " + (Integer)v.lastElement());
	      
	      // enumerate the elements in the vector.
	      Enumeration vEnum = v.elements();
	      System.out.println("\nElements in vector:");
	      
	      while(vEnum.hasMoreElements())
	         System.out.print(vEnum.nextElement() + " ");
	      System.out.println();

	}

}
