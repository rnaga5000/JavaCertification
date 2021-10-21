package MyPack;
import java.awt.*;
public class OurThread extends Frame implements Runnable
{
	
	int i=0;
	public OurThread()
	{
		Thread t1=new Thread(this);
		t1.start();
	}
	public void run()
	{
		try
		{
			for(int j=1;j<=30;j++)
			{
				repaint();
				Thread.sleep(1000);
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void paint(Graphics g)
	{
		g.drawString("i="+i, 100,150);
	}
	
	public static void main(String args[])
	{
		OurThread o=new OurThread();
		o.setVisible(true);
		o.setSize(300,200);
	}

}
