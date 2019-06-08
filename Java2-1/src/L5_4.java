import java.awt.*;

import javax.swing.*;

public class L5_4 extends JFrame{
	JButton [] bt={null,null,null,null,null,null,null,null,null};
	
	public L5_4(){
		bt[0]=new JButton("Madeleine");
		bt[1]=new JButton("Linda");
		bt[2]=new JButton("Sharon");
		bt[3]=new JButton("Tracy");
		bt[4]=new JButton("Grace");
		bt[5]=new JButton("Wengping");
		bt[6]=new JButton("Yating");
		bt[7]=new JButton("Janet");
		bt[8]=new JButton("Micheal");
		
		//this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setLayout(new GridLayout(3,3,45,45));
		
		int i;
		for(i=0;i<bt.length;i++){
			this.add(bt[i]);
		}
		
		this.setTitle("Direction");
		this.setLocation(200, 260);
		this.setSize(300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args){
		L5_4 frame2=new L5_4();
	}
}
