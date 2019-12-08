/*
<applet code = Mouse width=200 height=200>
</applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse extends Applet implements MouseListener{
	String message;
	int mousex=0;
	int mousey=0;
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		mousex=me.getX();
		mousey=me.getY();
		message="welcome";
		showStatus("mouse clicked at"+mousex+"and"+mousey);
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{

	}
	public void mouseExited(MouseEvent me)
	{

	}
	public void mousePressed(MouseEvent me)
	{

	}
	public void mouseReleased(MouseEvent me)
	{

	}
	public void paint(Graphics g)
	{
		g.drawString(message,mousex,mousey);
	}
}