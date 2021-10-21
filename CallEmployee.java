package MyPack;

import java.util.LinkedList;

public class CallEmployee 
{

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.setEmpid(101);
		e.setEname("PQR");
		e.setSalary(34000);
		System.out.println("ID "+e.getEmpid());
		System.out.println("Name "+e.getEname());
		System.out.println("Salary "+e.getSalary());
	}

}
