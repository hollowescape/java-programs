/*
<applet code= But width=200 height=200>
</applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class But extends Applet implements ActionListener{
	String message;
	public void init()
	{
		Button B1 =new Button("fact");
		Button B2=new Button("square");

		add(B1);
		add(B2);

		B1.addActionListener(this);
		B2.addActionListener(this);
	}
	public int fact(int n)
	{	int fac=1;
		for(int i=1;i<=n;i++)
		{
			fac=fac*i;
		}
		return fac;
	}
	public int sq(int n)
	{
		return n*n;
	}
	public void paint(Graphics g)
	{
		g.drawString(message,30,40);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String action=ae.getActionCommand();
		if(action.equals("fact"))
		{
			int n=fact(5);
			message=" factorial of number is"+n;
		}
		if(action.equals("square"))
		{
			int n=sq(5);
			message=" factorial of number is"+n;
		}
		repaint();
	}
}