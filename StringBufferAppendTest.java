package MyPack;

public class StringBufferAppendTest 
{
	public static void main(String args[])
	{
    StringBuffer sb = new StringBuffer("Test");
    System.out.println(sb);//Test

    sb.append(" String Buffer");
    System.out.println("After calling Append "+sb); //Test String Buffer

    sb.delete(3,7);  
    System.out.println("After callin delete "+sb); 

    sb.insert(1,"123");
    System.out.println("After Calling Insert "+sb); 

    sb.replace(3, 8, "ZARA");
    System.out.println("After Calling Replace "+sb); 

    StringBuffer buffer = new StringBuffer("Game Plan");
     buffer.reverse();

     System.out.println(buffer.substring(2,8));
     System.out.println("After calling reverse "+buffer);
 }  

}
