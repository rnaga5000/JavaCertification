package MyPack;

public class YourThread implements Runnable
{
	Thread t1=null;
	public YourThread()
	{
		t1=new Thread(this,"Java");
		t1.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Sorry for interuption...");
		}
		
	}
	public static void main(String[] args) 
	{
		YourThread m=new YourThread();
	}


}
