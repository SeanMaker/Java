import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;


public class L5_3 extends JFrame{
	JButton bt1,bt2,bt3,bt4,bt5;
	
	public L5_3(){
		bt1=new JButton("North");
		bt2=new JButton("South");
		bt3=new JButton("west");
		bt4=new JButton("East");
		bt5=new JButton("Center");
		
		this.add(bt1,BorderLayout.NORTH);
		this.add(bt2,BorderLayout.SOUTH);
		this.add(bt3,BorderLayout.WEST);
		this.add(bt4,BorderLayout.EAST);
		this.add(bt5,BorderLayout.CENTER);
		
		this.setTitle("Direction");
		this.setLocation(200, 260);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	
	public static void main(String[] args){
		
		L5_3 frame1=new L5_3();
	}
}
