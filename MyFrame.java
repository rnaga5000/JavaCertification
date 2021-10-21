package MyPack;
import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame
{
	JLabel lblno,lblname;
	JTextField txtno,txtname;
	JButton btnsubmit,btnreset;
	public MyFrame()
	{
		try
		{
			lblno=new JLabel("Enter No ");
			lblname=new JLabel("Enter Name ");
		
			txtno=new JTextField(10);
			txtname=new JTextField(10);
		
			btnsubmit=new JButton("Submit");
			btnreset=new JButton("Reset");
		
			setLayout(new GridLayout(3,2));
			add(lblno);add(txtno);
			add(lblname);add(txtname);
			add(btnsubmit);add(btnreset);
		}
		catch(Exception e)
		{
		JOptionPane.showMessageDialog(null, "please create a textbox ");
		}
	}
	public static void main(String args[])
	{
		MyFrame m=new MyFrame();
		m.setSize(200,300);
		m.setVisible(true);
		m.setTitle("My First Frame");
	}

}
