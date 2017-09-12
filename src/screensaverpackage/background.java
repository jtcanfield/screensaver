package screensaverpackage;


import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

@SuppressWarnings("serial")
public class background extends Applet {
	public background(){
		
	}
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(0,0,1360,660);
		g.setColor(Color.white);
		g.fillRect(20,20,1320,620);
    }
}