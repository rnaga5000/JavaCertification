package MyPack;
import java.applet.*;
import java.awt.*;
/*<applet code=RollingText height=600 width=600></applet>*/
public class RollingText extends Applet implements Runnable
{
	Thread t1=null;
	private int x;
	public void init()
	{
		x=590;
		t1=new Thread(this);
		t1.start();
	}
	public void run()
	{
		while (true)
		{
			try
			{ 	
				x--;	
				Thread.sleep(10);
				repaint();	
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public void paint(Graphics g)
	{
		g.drawString("Welcome ",100,200);
		g.drawString("Mumbai, Maharashtra",x,100);

	}

}
