import javax.swing.*;
import java.awt.*;


public class L5_9 extends JFrame{
	JPanel panel_1,panel_2,panel_3;
	JButton bt_login,bt_cancel;
	JLabel lb_character,lb_gender;
	JCheckBox ck_music,ck_pe,ck_art;
	JRadioButton radio_male,radio_female;
	ButtonGroup btgroup;
	
	public static void main(String[] args){
		L5_9 regist=new L5_9();
	}
	
	
	public L5_9(){
		panel_1=new JPanel();
		panel_2=new JPanel();
		panel_3=new JPanel();
		
		bt_login=new JButton ("Log in");
		bt_cancel=new JButton("Cancel");
		
		lb_character=new JLabel("Specialty:");
		lb_gender=new JLabel("Gender:");
		
		ck_music=new JCheckBox("Music");
		ck_pe=new JCheckBox("PE");
		ck_art=new JCheckBox("Art");
		
		radio_male=new JRadioButton("Male");
		radio_female=new JRadioButton("Female");
		
		btgroup=new ButtonGroup();
		btgroup.add(radio_male); btgroup.add(radio_female);
		
		
		panel_1.add(lb_character); panel_1.add(ck_music);
		panel_1.add(ck_pe); panel_1.add(ck_art);
		
		panel_2.add(lb_gender); panel_2.add(radio_male);
		panel_2.add(radio_female);
		
		panel_3.add(bt_login);panel_3.add(bt_cancel);
		
		this.setLayout(new GridLayout(3,1));
		this.add(panel_1);
		this.add(panel_2);
		this.add(panel_3);
		
		this.setTitle("Registration");
		this.setLocation(200, 260);
		this.setSize(260,160);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
}
