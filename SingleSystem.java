package MyPack;
import java.awt.*;
public class SingleSystem extends Frame implements Runnable
{
	
	public SingleSystem()
	{
		Thread t1=new Thread(this);
		t1.start();
	}
	public void run()
	{
		while(true)
		{
		setBackground(Color.red);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.print("Sorry for Interruption...");
		}
		
		setBackground(Color.green);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.print("Sorry for Interruption...");
		}
		
		setBackground(Color.yellow);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.print("Sorry for Interruption...");
		}
		
		setBackground(Color.blue);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.print("Sorry for Interruption...");
		}
		
		setBackground(Color.darkGray);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.print("Sorry for Interruption...");
		}
		
		
		
		}
	}
	public static void main(String[] args) 
	{
		SingleSystem s1=new SingleSystem();
		s1.setVisible(true);
		s1.setSize(100,200);
	}

}
