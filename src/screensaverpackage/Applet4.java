package screensaverpackage;


import java.applet.Applet;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.util.Random;

public class Applet4 extends Applet1 {
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
		
		rect3 = new Rectangle();
		rect3.x = 0;
		rect3.y = 0;
		rect3.width = 50;
		rect3.height = 50;
		
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
	int i = r.nextInt(8);
	//g.setColor(colors[i]);
	//rect2Color=colors[i]; //stops color for being random
	
	g.setColor(Color.blue);
	g.fillRect(0,0,1360,660);
	g.setColor(Color.white);
	g.fillRect(20,20,1320,620);
	
	
	int i1 = r.nextInt(8);
	g.setColor(colors[i1]);
	g.fillRect(rect1.x,rect1.y,rect1.width,rect1.height);
	g.setColor(colors[i1]);
	g.fillRect(rect2.x,rect2.y,rect2.width,rect2.height);
	g.setColor(Color.black);
	g.fillRect(rect3.x,rect3.y,rect3.width,rect3.height);
}
public class refresh extends Thread{
	public Applet4 myapplet;
	
	//public int velocity = 10;
	public void run(){
		while(true){
		myapplet.repaint();
		try {
			//sleep(200);
			sleep(10);
			int numX = (int) (1);
			int numY = (int) (1);
				//int num1;		num1 = (int) (Math.random() * 10);
				//int num11;		num11 = (int) (Math.random() * -10);
				//int num2;		num2 = (int) (Math.random() * 10);
				//int num22;		num22 = (int) (Math.random() * -10);
				//int num3;		num3 = (int) (Math.random() * 10);
				//int num33;		num33 = (int) (Math.random() * -10);
				//int num4;		num4 = (int) (Math.random() * 10);
				//int num44;		num44 = (int) (Math.random() * -10);
				if (myapplet.rect1.x + myapplet.rect1.width <=20){
					numX = 1;
				}
				if (myapplet.rect1.x + myapplet.rect1.width >=1320){	
					numX = -1;
				}
				if (myapplet.rect1.y + myapplet.rect1.width <=20){
					numY = 1;
				}
				if (myapplet.rect1.y + myapplet.rect1.width >=620){	
					numY = -50;
				}
				myapplet.rect1.x = myapplet.rect1.x +numX;
				myapplet.rect1.y = myapplet.rect1.y +numY;
				//myapplet.rect1.x = myapplet.rect1.x +num1;
				//myapplet.rect1.x = myapplet.rect1.x +num11;
				//myapplet.rect1.y = myapplet.rect1.y +num2;
				//myapplet.rect1.y = myapplet.rect1.y +num22;
				//myapplet.rect2.x = myapplet.rect2.x +num3;
				//myapplet.rect2.x = myapplet.rect2.x +num33;
				//myapplet.rect2.y = myapplet.rect2.y +num4;
				//myapplet.rect2.y = myapplet.rect2.y +num44;
				
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			/*Color temp = myapplet.color1;
			myapplet.repaint();
			myapplet.color1= myapplet.color2;
			myapplet.color2= temp;*/
}}}}