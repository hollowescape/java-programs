//<applet code="sim_button" width=300 height=300></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class sim_button extends Applet implements KeyListener{
	String msg="";
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent e)
	{
		showStatus("Key down");
	}
	public void keyReleased(KeyEvent e)
	{
		showStatus("Key up");
	}
	public void keyTyped(KeyEvent e)
	{
		msg+=e.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,20,20);
	}
}