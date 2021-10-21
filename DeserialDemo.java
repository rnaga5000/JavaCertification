package MyPack;
import java.io.*;
public class DeserialDemo 
{
	public static void main(String args[])
	{
		FileInputStream fis;
		ObjectInputStream ois;
		try
		{
		EmployeeData od,od1,od2;
		fis=new FileInputStream("D:\\Serial.txt");
		ois=new ObjectInputStream(fis);
		od=(EmployeeData) ois.readObject();
		od1=(EmployeeData) ois.readObject();
		od2=(EmployeeData) ois.readObject();
		od.display();
		od1.display();
		od2.display();
		ois.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}