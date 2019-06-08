package Lesson8;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class L8_1  extends JFrame{
	
	Wdmb mb=null;
	
	public static void main(String[] args){
		L8_1 draw=new L8_1();
		
	}
	
	public L8_1(){
		mb=new Wdmb();
		this.add(mb);
		this.setSize(400, 300);
		this.setLocation(300, 280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
	}

}

class Wdmb extends JPanel{
	public void paint(Graphics g){
		//g.drawOval(20, 30, 80, 80);
		//g.drawLine(100, 50, 300, 150);
		//g.drawRect(100, 100, 80, 80);
		g.draw3DRect(100, 100, 50, 60,false);
		g.setColor(Color.cyan);
		g.fillRect(100, 100, 50, 60);
	}
	
}