package MyPack;

public class ReplaceExample1 
{
	public static void main(String args[])
	{  
		String s1="javatpoint is a very good website";  
		String replaceString=s1.replace('a','e');//replaces all //occurrences of 'a' to 'e'  
		System.out.println(replaceString);  
		String str="c:/abc/t.txt";
String rstr=str.replace("c:/abc/t.txt","c:\\abc\\t.txt");
		System.out.println(rstr);
	
	}

}
