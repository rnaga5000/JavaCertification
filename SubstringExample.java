package MyPack;

public class SubstringExample 
{
	public static void main(String args[])
	{  
		String s1="javatpoint"; 
		String s2="ABCXYZ";
		System.out.println(s1.substring(0,4));//returns va  
		System.out.println(s2.substring(2,5));//returns vatpoint  
		System.out.println(s1.substring(0,4)+s2.substring(2,6));		int s3=s1.length()-4;
	}

}
