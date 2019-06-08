import java.awt.*;
import javax.swing.*;

import org.omg.CORBA.PUBLIC_MEMBER;

public class L5_1 extends JFrame{
	JButton button1=null;
	
	public static void main(String[] args){
		
		L5_1 function =new L5_1();
		
	}
		
	public L5_1(){
		this.setTitle("Library");
		this.setLocation(100, 260);
		this.setSize(500, 500);
		button1=new JButton("Search");
		this.add(button1);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
}

