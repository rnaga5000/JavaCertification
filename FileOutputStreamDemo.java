package MyPack;
import java.io.*;
class FileOutputStreamDemo
{
	public static void main(String args[]) throws Exception
	{
		String source="these is a test string \n This is another string";
		byte buf[]=source.getBytes();
		FileOutputStream f0=new FileOutputStream("D:\\YourFile.txt");
		System.out.println("Length "+buf.length);
		for(int i=0;i<buf.length;i++)
		{
			f0.write(buf[i]);
		}
		f0.close();
	}
}