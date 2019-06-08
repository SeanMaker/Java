import javax.swing.*;

import java.awt.*;


public class L5_13 extends JFrame {
		JLabel label_pic,label_account,label_psd,label_forget,label_apply;
		JPanel panel_1, panel_2, panel_3,panel_4;
		JButton bt_login,bt_cancel,bt_guide,bt_clear;
		JTextField txt_account;
		JTabbedPane tabbedPane;
		JPasswordField psd;
		JCheckBox checkBox_log,checkBox_remember;
		
		public static void main(String[] args){
			L5_13 qq_login=new L5_13();
			
		}
		
		public L5_13() {
			// TODO Auto-generated constructor stub
			
			label_pic=new JLabel(new ImageIcon("images/tou.gif"));
			
			
			label_account=new JLabel("Username",JLabel.CENTER);// label center appearance
			label_psd=new JLabel("Password",JLabel.CENTER);
			label_forget=new JLabel("Forget?",JLabel.CENTER);
			label_forget.setFont(new Font("Times New Roman", Font.PLAIN, 16));//Font style,size
			label_forget.setForeground(Color.BLUE);// Font color
			label_apply= new JLabel("<html><a href='www.google.com'>Security Gradeup</a>");
			label_apply.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			
			
			label_apply=new JLabel("Securiry Upgrade");
			
			panel_1=new JPanel();
			panel_2=new JPanel();
			panel_3=new JPanel();
			panel_3.setBackground(Color.BLUE);
			panel_4=new JPanel();
			panel_4.setBackground(Color.GREEN);
			
			
			bt_login=new JButton("Login");
			bt_cancel=new JButton("Cancel");
			bt_guide=new JButton("Guide");
			bt_clear=new JButton("Clear");
			
			
			txt_account=new JTextField();
			psd= new JPasswordField();
			
			tabbedPane=new JTabbedPane();//add choice card
			tabbedPane.add("User",panel_2);
			tabbedPane.add("Administrator",panel_3);
			tabbedPane.add("Developer",panel_4);
			
			checkBox_log=new JCheckBox("Invisible Login");
			checkBox_remember=new JCheckBox("Lock Account");
			
			panel_2.setLayout(new GridLayout(3,3));
			
			panel_1.add(bt_login); panel_1.add(bt_cancel); panel_1.add(bt_guide);
			panel_2.add(label_account); panel_2.add(txt_account); panel_2.add(bt_clear);
			panel_2.add(label_psd);  panel_2.add(psd); panel_2.add(label_forget);
			panel_2.add(checkBox_log); panel_2.add(checkBox_remember); panel_2.add(label_apply);
			
			this.add(label_pic,BorderLayout.NORTH);
			this.add(panel_1,BorderLayout.SOUTH);
			this.add(tabbedPane,BorderLayout.CENTER);
			
			this.setTitle("QQ");
			this.setIconImage((new ImageIcon("images/Axialis-Icon-Workshop-icon.png").getImage()));
			this.setLocation(260, 300);
			this.setSize(460, 280);
			this.setResizable(false);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(true);
			
			
			
			
			
			
			
			
			
		}
}
