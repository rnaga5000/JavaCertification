package MyPack;
import java.util.*;
class Employee1
{
	int empid;
	String empname;
	String empaddress;
	Scanner sc=new Scanner(System.in);
	public void getInfo()
	{
		System.out.println("Enter Employee ID ");
		empid=sc.nextInt();
		System.out.println("Enter Employee Name ");
		empname=sc.next();
		System.out.println("Enter Employee Address ");
		empaddress=sc.next();
	}
	public void printInfo()
	{
		System.out.println("Employee ID "+empid);
		System.out.println("Employee Name "+empname);
		System.out.println("Employee Address "+empaddress);
		
	}
}
class Trainer extends Employee1
{
	int salary;
	public void getInfoTrainer()
	{
		getInfo();
		System.out.println("Enter Salary of a Trainer ");
		salary=sc.nextInt();
	}
	public void printInfoTrainer()
	{
		printInfo();
		System.out.println("Salary "+salary);
	}
}
class Host extends Employee1
{
	int salary;

	public void getInfoHost()
	{
		getInfo();
		System.out.println("Enter Salary of a Host ");
		salary=sc.nextInt();
	}
	public void printInfoHost()
	{
		printInfo();
		System.out.println("Salary "+salary);
	}
}
class Councellor extends Employee1
{
	int salary;

	public void getInfoCouncellor()
	{
		getInfo();
		System.out.println("Enter Salary of a Councellor ");
		salary=sc.nextInt();
	}
	public void printInfoCouncellor()
	{
		printInfo();
		System.out.println("Salary "+salary);
	}
}
public class Call 
{
	public static void main(String args[])
	{
		Trainer t1=new Trainer();
		Host h1=new Host();
		Councellor c1=new Councellor();
		t1.getInfoTrainer();
		h1.getInfoHost();
		c1.getInfoCouncellor();
		System.out.println("-----Printing Information -----");
		t1.printInfoTrainer();
		h1.printInfoHost();
		c1.printInfoCouncellor();
	}
}
