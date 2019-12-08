/*
<applet code ="Amaz" width=300 height=300>
</applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class Amaz extends Applet implements ActionListener{
	String message="";
	public void init()
	{
		Button B1=new Button("Amazon");
		Button B2=new Button("Goggle");
		Button B3=new Button("Yahoo");

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
		if(action.equals("Amazon"))
		{
			message="Welcome to Amazon";
			
		}
		if(action.equals("Goggle"))
		{
			message="Welcome to Goggle";
	
		}
		if(action.equals("Yahoo"))
		{
			message="Welcome to Yahoo";
			
		}
		repaint();

	}
}