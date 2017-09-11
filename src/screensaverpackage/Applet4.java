package screensaverpackage;


import java.applet.Applet;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Event;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.util.Random;

public class Applet4 extends Applet {
	/*public Color color1 = Color.red;
	public Color color2 = Color.blue;
	public Color color3 = Color.black;
	public Color color4 = Color.cyan;
	public Color color5 = Color.magenta;
	public Color color6 = Color.green;
	public Color color7 = Color.orange;
	public Color color8 = Color.pink;
	public Color color9 = Color.yellow;*/
	/*public int rect1diff = +10;
	public int rect1diff = -10;*/
	public Rectangle rect1;
	public Rectangle rect2;
	public Rectangle rect3;
	
	public Applet4(){
		rect1 = new Rectangle();
		rect1.x = 100;
		rect1.y = 100;
		rect1.width = 100;
		rect1.height = 100;
		
		rect2 = new Rectangle();
		rect2.x = 0;
		rect2.y = 0;
		rect2.width = 10;
		rect2.height = 10;
		
		refresh thread= new refresh();	
		thread.myapplet = this;
		thread.start();
	}
public void paint(Graphics g){
	Random r = new Random();
	Color [] colors = new Color[9];
	colors[0]=Color.black;
	colors[1]=Color.blue;
	colors[2]=Color.cyan;
	colors[3]=Color.magenta;
	colors[4]=Color.green;
	colors[5]=Color.orange;
	colors[6]=Color.pink;
	colors[7]=Color.red;
	colors[8]=Color.yellow;
	//int i = r.nextInt(8);
	//g.setColor(colors[i]);
	//rect2Color=colors[i]; //stops color for being random
	
	g.setColor(Color.blue);
	g.fillRect(0,0,1360,660);
	g.setColor(Color.white);
	g.fillRect(20,20,1320,620);
	
	
	int i1 = r.nextInt(8);
	g.setColor(Color.red);
	g.fillRect(rect1.x,rect1.y,rect1.width,rect1.height);
	g.setColor(colors[i1]);
	g.fillRect(rect2.x,rect2.y,rect2.width,rect2.height);
}
public class refresh extends Thread{
	public Applet4 myapplet;
	boolean horizontalposi = true;
    boolean verticalposi = true;
	public int velocity = 1;
	public void run(){
		while(true){
		myapplet.repaint();
		try {
			//sleep(200);
			sleep(15);
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
					myapplet.rect1.x = myapplet.rect1.x +1;
				} else {
					myapplet.rect1.x = myapplet.rect1.x -1;
				}
				if (verticalposi == true){
					myapplet.rect1.y = myapplet.rect1.y +1;
				} else {
					myapplet.rect1.y = myapplet.rect1.y -1;					
				}
				
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			/*Color temp = myapplet.color1;
			myapplet.repaint();
			myapplet.color1= myapplet.color2;
			myapplet.color2= temp;*/
}}}}