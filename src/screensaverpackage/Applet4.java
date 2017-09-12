package screensaverpackage;


import java.applet.Applet;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Event;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.TimerTask;
import javax.swing.Timer;

public class Applet4 extends background {
	public Rectangle rect1;
//	public Rectangle rect2;
	public Applet4(){
		rect1 = new Rectangle();
		rect1.x = 100;
		rect1.y = 100;
		rect1.width = 100;
		rect1.height = 100;
		
//		rect2 = new Rectangle();
//		rect2.x = 0;
//		rect2.y = 0;
//		rect2.width = 10;
//		rect2.height = 10;
		
		refresh thread= new refresh();	
		thread.myapplet = this;
		thread.start();
	}
public void animation(Graphics g){
//	super.paint(g);    
//	g.setColor(Color.red);
//	g.fillRect(rect1.x,rect1.y,rect1.width,rect1.height);
}
background e=new background();

public void paint(Graphics g){
//	Random r = new Random();
//	Color [] colors = new Color[9];
//	colors[0]=Color.black;
//	colors[1]=Color.blue;
//	colors[2]=Color.cyan;
//	colors[3]=Color.magenta;
//	colors[4]=Color.green;
//	colors[5]=Color.orange;
//	colors[6]=Color.pink;
//	colors[7]=Color.red;
//	colors[8]=Color.yellow;
	e.draw(g);
//	g.setColor(Color.blue);
//	g.fillRect(0,0,1360,660);
//	g.setColor(Color.white);
//	g.fillRect(20,20,1320,620);
//	private BufferedImage bf;
//    bf = new BufferedImage( rect1.width,rect1.height, BufferedImage.TYPE_INT_RGB);
	g.setColor(Color.red);
	g.fillRect(rect1.x,rect1.y,rect1.width,rect1.height);
	
//	int i1 = r.nextInt(8);
//	g.setColor(colors[i1]);
//	g.fillRect(rect2.x,rect2.y,rect2.width,rect2.height);
//	rect2Color=colors[i]; //stops color for being random
}



public class refresh extends Thread{
	public Applet4 myapplet;
	boolean horizontalposi = true;
    boolean verticalposi = true;
	public int velocity = 1;
	public void run(){
		while(true){
		myapplet.repaint();
		animation(myapplet.getGraphics());
		try {
			sleep(2);
			
				if (myapplet.rect1.x <=20){
					horizontalposi = true;
				}
				if (myapplet.rect1.x + myapplet.rect1.width >=1340){
					horizontalposi = false;
				}
				if (myapplet.rect1.y <=20){
					verticalposi = true;
				}
				if (myapplet.rect1.y + myapplet.rect1.width >=640){	
					verticalposi = false;
				}
				if (horizontalposi == true){
					myapplet.rect1.x = myapplet.rect1.x +velocity;
				} else {
					myapplet.rect1.x = myapplet.rect1.x -velocity;
				}
				if (verticalposi == true){
					myapplet.rect1.y = myapplet.rect1.y +velocity;
				} else {
					myapplet.rect1.y = myapplet.rect1.y -velocity;					
				}
				
			} catch (InterruptedException e){
				e.printStackTrace();
			}
}}}}