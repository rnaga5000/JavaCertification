package MyPack;
//method local inner class
/*
 * a class inside method of outer class is called as method local inner class
 */
public class localinner1//outer class 
{
  private int data=30;//instance variable  
	
  	void display()
	{  
		  class Local //inner class
		  {  
			   void msg()
			  { 
			      System.out.println("I am inside method local inner class");
			 }  
		  }  

		  Local l=new Local();  
		  l.msg();  
	 }  

	 public static void main(String args[])
	{  
		  localinner1 obj=new localinner1();  
		  System.out.println(obj.data);
		  obj.display();  
	 }  

}
