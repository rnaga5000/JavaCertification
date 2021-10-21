package MyPack;

public class CopyValueTest
{
	   public static void main(String args[])
	   {
	       char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
	       String Str2="";

	       Str2 = Str2.copyValueOf( Str1 );
	       System.out.println("Returned String1: " + Str2);

	       Str2 = Str2.copyValueOf( Str1, 2, 6 );
	       System.out.println("Returned String2: " + Str2);
	    }

}
