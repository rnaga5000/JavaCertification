package MyPack;

public class CompareTo 
{
	   public static void main(String args[])
	   {
	      String str1 = "S";
	      String str2 = "s";
	      String str3 = "T";

	      int result = str1.compareTo( str2 );//if values are mathed then it returns 0
	      System.out.println(result);//0
		  
	      result = str2.compareTo( str3 );// if values are not matched then it returns 10
	      System.out.println(result);//10
		 
	      result = str3.compareTo( str1 );//in upward comparision if values are not matched then -10
	      System.out.println(result);//-10
	   }

}
