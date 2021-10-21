package MyPack;
import java.sql.*;
public class ClassNotFoundExceptionDemo 
{
	public static void main(String[] args) 
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		}
		catch(Exception e)
		{
			System.out.println("Driver is removed from the version ");
		}
		System.out.println("@@@@");
	}
}
