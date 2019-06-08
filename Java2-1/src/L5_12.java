import java.awt.*;

import javax.swing.*;

public class L5_12 extends JFrame{
	JTextArea txtarea;
	JComboBox boxes;
	JTextField text;
	JButton bt_send;
	JPanel panel_1;
	JScrollPane scroll;   //
	
	public static void main(String[] args){
		L5_12 chat=new L5_12();
	}
	
	public L5_12() {
		// TODO Auto-generated constructor stub
		
		txtarea= new JTextArea();
		
		panel_1=new JPanel();
		
		String[] person={"Madeleine","Sharon","Tracy","Linda","Grace"};
		boxes=new JComboBox(person);
		
		text=new JTextField(10);
		scroll=new JScrollPane(txtarea); //
		
		bt_send=new JButton("Send");
		
		panel_1.add(boxes); panel_1.add(text); panel_1.add(bt_send);
		
		this.add(scroll);  //
		this.add(panel_1,BorderLayout.SOUTH);
		
		this.setTitle("QQ");
		this.setIconImage((new ImageIcon("images/Axialis-Icon-Workshop-icon.png").getImage()));
		this.setLocation(260, 300);
		this.setSize(500, 360);
		//this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
