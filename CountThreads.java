package MyPack;

public class CountThreads extends Thread
{
	
	public CountThreads()
	{
		Thread t1=new Thread(this);
		Thread t2=new Thread(this);
		t1.setName("x");
		t2.setName("y");
		t1.start();
		t2.setDaemon(true);
		System.out.println("Number of active Threads "+Thread.activeCount());
		System.out.println("Is t2 is Dameon? " +t2.isDaemon());
		System.out.println("T1 Name "+t1.getName());
		System.out.println("T2 Name "+t2.getName());
	}
	public void run()
	{
		
	}
	public static void main(String[] args) 
	{
		CountThreads c=new CountThreads();
	}

}
