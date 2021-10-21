package MyPack;
//Java static nested class example with static method
import java.util.*;
class PaymentDetails
{  
	  static int age;//you can access this variable by class name
	  static class ValidateYouth
    {  
		static void msg()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Age ");
			age=sc.nextInt();
			if(age>=18 && age<25)
			{
				System.out.println("Your are in Youth category");
			}
		}  
	  }  

	  static class ValidateAdult
    	  {  
		static void msg()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Age ");
			age=sc.nextInt();
			if(age>=25 && age<55)
			{
				System.out.println("Your are in Adult category");
			}
		}  
	  }  

	  static class ValidateOld
    	  {  
		static void msg()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Age ");
			age=sc.nextInt();
			if(age>=55)
			{
				System.out.println("Your are in Old category");
			}
			else
			{
				System.out.println("@@@@@@");
			}
		}  
	  }  


	  public static void main(String args[])
	  {  
	//no need to create the 		
	//instance of static nested class  
 	PaymentDetails.ValidateYouth.msg();
	PaymentDetails.ValidateAdult.msg();
	PaymentDetails.ValidateOld.msg();
	  }  
}
