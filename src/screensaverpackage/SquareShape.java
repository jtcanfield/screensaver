package screensaverpackage;


import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Rectangle;
import java.util.Random;
public class SquareShape extends Shape {
	public SquareShape(int x, int y, int width, Color color){
		super.x=x;
		super.y=y;
		super.width=width;
		super.height=width;
		super.color=color;
	}
	public void draw(Graphics g){
		g.setColor(color);
		g.fillRect(x,y,width,height);
	}
	public void rotate(int direction){
		//done
	}
}