package MyPack;
import java.io.*;
import java.lang.*;

public class FileRead1 
{

		public static void main(String args[])
		{
			try
			{
				InputStream in= new FileInputStream("D:\\New Data 2020\\Simplilearn\\Test\\Phase1\\src\\MyPack\\myfile.txt");
				char ch;
				int s=0;
				int i=in.available();//25
				System.out.println("Available data "+in.available());
				while(s<=i)
				{
					//content[i]=ch;
					ch=(char)in.read();
					System.out.print(ch);
					s++;
				}
			}
			catch(Exception e)
			{
				System.out.println("Please check the file");
			}
			System.out.println("I am after exception");
		}
	}