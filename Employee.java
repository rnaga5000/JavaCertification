package MyPack;
//Pojo :- plain old java object (getter and setter)
public class Employee 
{
	private int empid;
	private String ename;
	private int salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() 
	{
		if(salary>30000)
		{
		return salary;
		}
		else
		{
			return 0;
		}
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
