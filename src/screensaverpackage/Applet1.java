package screensaverpackage;


import screensaverpackage.Applet4.refresh;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Event;
import java.awt.Rectangle;
import java.util.Random;
public class Applet1 extends Applet {
	public Applet1(){
		refresh thread= new refresh();
		thread.myapplet = this;
		thread.start();
	}
	public void paint (Graphics g){
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
		g.setColor(colors[i]);
		//rect2color=colors[i]; //stops color for being random
		
		int i1 = r.nextInt(8);
		g.setColor(colors[i1]);
		int num;		num = (int) (Math.random() * 1100);
		int num0;		num0 = (int) (Math.random() * 600);
		g.fillRect(num,num0,100,100);
		
		int i2 = r.nextInt(8);
		g.setColor(colors[i2]);
		int num1;		num1 = (int) (Math.random() * 1100);
		int num2;		num2 = (int) (Math.random() * 600);
		g.fillRect(num1,num2,100,100);
		
		int i3 = r.nextInt(8);
		g.setColor(colors[i3]);
		int num3;		num3 = (int) (Math.random() * 1100);
		int num4;		num4 = (int) (Math.random() * 600);
		g.fillRect(num3,num4,100,100);

		int i4 = r.nextInt(8);
		g.setColor(colors[i4]);
		int num5;		num5 = (int) (Math.random() * 1100);
		int num6;		num6 = (int) (Math.random() * 600);
		g.fillRect(num5,num6,100,100);

		int i5 = r.nextInt(8);
		g.setColor(colors[i5]);
		int num7;		num7 = (int) (Math.random() * 1100);
		int num8;		num8 = (int) (Math.random() * 600);
		g.fillRect(num7,num8,100,100);
		
		int i6 = r.nextInt(8);
		g.setColor(colors[i6]);
		int num9;		num9 = (int) (Math.random() * 1100);
		int num10;		num10 = (int) (Math.random() * 600);
		g.fillRect(num9,num10,100,100);
		
		int i7 = r.nextInt(8);
		g.setColor(colors[i7]);
		int num11;		num11 = (int) (Math.random() * 1100);
		int num12;		num12 = (int) (Math.random() * 600);
		g.fillRect(num11,num12,100,100);
		
		int i8 = r.nextInt(8);
		g.setColor(colors[i8]);
		g.fillRect(0,0,9999,9999);
}	
		public class refresh extends Thread{
			public Applet1 myapplet;
			/*public void run(){
				while(true){
				myapplet.repaint();
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
}}*/
			}
		}
/*boolean doTheyIntersect = r1.intersects(r2);
if (doTheyIntersect == true){
	g.drawString("yes", 0, 1000);}*/