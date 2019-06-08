import javax.swing.*;

import java.awt.*;

public class L5_7 extends JFrame{
	JButton [] bt={null,null,null,null,null};
	JPanel panel_1,panel_2;
	
	
	
	public L5_7(){
		bt[0]=new JButton("Cock Cola");
		bt[1]=new JButton("Red Tea");
		bt[2]=new JButton("Green Tea");
		bt[3]=new JButton("Beer");
		bt[4]=new JButton("Spring Water");
		
		panel_1=new JPanel();
		panel_2=new JPanel();
		
		panel_1.add(bt[2]); panel_1.add(bt[3]);
		panel_2.add(bt[0]); panel_2.add(bt[1]);
		
		this.add(panel_1,BorderLayout.NORTH);
		this.add(panel_2,BorderLayout.SOUTH);
		this.add(bt[4]);
		

		
		this.setTitle("Application");
		this.setLocation(200, 260);
		this.setSize(500,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

		
	}
	
	public static void main(String[] args){
		L5_7 frame3=new L5_7();
	}
	

}
