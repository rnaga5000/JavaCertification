package MyPack;
import java.io.File;
import java.util.*;
class FileDemo
{
	
	public static void main(String args[])
	{
	File f1=new File("D:\\Nilesh\\Doraemon.txt");
	System.out.println(f1.isDirectory());
	System.out.println("File name: "+f1.getName());
	System.out.println("Abs path :"+f1.getAbsolutePath());
	System.out.println("Parent: "+f1.getParent());
	System.out.println(f1.exists());
	System.out.println(f1.canWrite()? "is Writable":"not writable");
	System.out.println(f1.canRead()?"is readable":"not readable");
	System.out.println(new Date());
	System.out.println("File last modified:"+new Date(f1.lastModified()));
	System.out.println("File size:"+f1.length());
	}
}