package MyPack;
import java.util.*;
/*
 * Map is an interface which is implemented on HashMap and it stores
 * data in key-value format 
 * we can duplicate the value but we cannot duplicate the key
 * key must be unique
 * 
 */
public class HashMapExample1 
{

	public static void main(String[] args) 
	{
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  hm.put(100,"Amit"); //it is used to store the value 
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  hm.put(103,"Rahul");  
		  for(Map.Entry m:hm.entrySet())//modern value
		  {  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  

		  hm.put(104, "Saurabh");	
		  System.out.println("------------------");
		  for(Map.Entry m:hm.entrySet())//modern value
		  {  
		    System.out.println(m.getKey()+" "+m.getValue());  
		   }  
		  System.out.println("------------------");
		  hm.remove(103);
		  for(Map.Entry m:hm.entrySet())//modern value
		  {  
		    System.out.println(m.getKey()+" "+m.getValue());  
		   }  
		  hm.put(104, "Hardik");
		  System.out.println("------------------");
		  hm.remove(103);
		  for(Map.Entry m:hm.entrySet())//modern value
		  {  
		    System.out.println(m.getKey()+" "+m.getValue());  
		   }  

		  
	}

}
