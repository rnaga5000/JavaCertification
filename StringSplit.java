package MyPack;
import java.util.*;
public class StringSplit 
{
	public static void main(String args[])
	{
	String shirts="Blue Shirt, Black Shirt, Pink Shirt, Maroon Shirt";
	String[] result=shirts.split(",");

	for(String str:result)
	{
		System.out.println(str);
	}

	System.out.println("Printing With String Tokenizer");
	StringTokenizer st=new StringTokenizer(shirts,", ");
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
	}

}
