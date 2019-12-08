/*
<applet code ="Morn" width=300 height=300>
</applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class Morn extends Applet implements ActionListener{
	String message="";
	public void init()
	{
		Button B1=new Button("Morning");
		Button B2=new Button("Afternoon");
		Button B3=new Button("Evening");

		add(B1);
		add(B2);
		add(B3);

			B1.addActionListener(this);
			B2.addActionListener(this);	
			B3.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(message,40,50);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String action=ae.getActionCommand();
		if(action.equals("Morning"))
		{
			message="Good Morning to you";
			
		}
		if(action.equals("Afternoon"))
		{
			message="Good Afternoon to you";
	
		}
		if(action.equals("Evening"))
		{
			message="Good Evening to you";
			
		}
		repaint();

	}
}