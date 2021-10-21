package MyPack;
import java.io.*;
import java.io.ObjectOutputStream;
class SerialDemo
{
	public static void main(String args[])
	{
		try
		{
			EmployeeData od=new EmployeeData("Rohan",20,10000);
			EmployeeData od1=new EmployeeData("Prasad",20,20000);
			EmployeeData od2=new EmployeeData("Zaiba",20,15000);
			EmployeeData od3=new EmployeeData("Thirthali",20,18000);
			EmployeeData od4=new EmployeeData("padma",20,21000);
			
			
	FileOutputStream fos=new FileOutputStream("D:\\Serial.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(od);
			oos.writeObject(od1);
			oos.writeObject(od2);
			oos.writeObject(od3);
			oos.writeObject(od4);
			od.display();
			od1.display();
			od2.display();
			od3.display();
			od4.display();
		
			oos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
	}
}