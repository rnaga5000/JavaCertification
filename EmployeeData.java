package MyPack;
import java.io.*;	
public class EmployeeData implements Serializable
{	
	public String n;
	public int a,s;
	public EmployeeData(String name,int age,int salary)
	{
		n=name;
		a=age;
		s=salary;
	}
	public void display()
	{
		System.out.println("Name "+n);
		System.out.println("Age "+a);	
		System.out.println("Salary "+s);
		
	}
}