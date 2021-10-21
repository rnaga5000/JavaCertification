package MyPack;
class Caller
{
	synchronized void call(int m)
	{
		System.out.print(" "+m);
		try
		{
		Thread.sleep(500);		
		}
		catch(Exception e)
		{}
		System.out.println("done");
	}
}
class Callme implements Runnable
{
	Thread t;
	int num;
	Caller target;	
	Callme(Caller targ,int m)
	{
		target=targ;
		num=m;
		t=new Thread(this);
		t.start();	
	}
	public void run()
	{
			try{
			target.call(num);
			}catch(Exception e){}
		
	}
}	
class Sync1
{
	public static void main(String args[])
	{
		Caller target=new Caller();
		int digit=10;
		Callme obj1=new Callme(target,digit++);
		Callme obj2=new Callme(target,digit++);
		Callme obj3=new Callme(target,digit++);
		try{
		Thread.sleep(1000);
		}catch(Exception e){}
	}	
}