import javax.swing.*;
import java.awt.*;

public class L5_8 extends JFrame{
	JPanel panel_1,panel_2,panel_3;
	JButton button_1,button_2;
	JLabel label_1,label_2;
	JTextField text;
	JPasswordField psd;
	
	public static void main(String[] args){
		L5_8 login=new L5_8();
	}
	
	
	public L5_8(){
	
		panel_1=new JPanel();
		panel_2=new JPanel();
		panel_3=new JPanel();
		
		button_1=new JButton("Login");
		button_2=new JButton("Cancel");
		
		label_1=new JLabel("Username");
		label_2=new JLabel("Password");
		
		text=new JTextField(10);
		psd=new JPasswordField(10);
		
		panel_1.add(label_1); panel_1.add(text);
		panel_2.add(label_2); panel_2.add(psd);
		panel_3.add(button_1); panel_3.add(button_2);
		
		this.setLayout(new GridLayout(3,1));
		
		this.add(panel_1);
		this.add(panel_2);
		this.add(panel_3);
		
		this.setTitle("Application");
		this.setLocation(200, 260);
		this.setSize(260,160);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
