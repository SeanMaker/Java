import java.awt.*;

import javax.swing.*;

public class L5_10  extends JFrame{
	JPanel panel_1,panel_2;
	JLabel label_1,label_2;
	JComboBox boxes;
	JList list;
	JScrollPane sp;
	
	public static void main(String[] args){
		L5_10 searchL5_10=new L5_10();
	}
	
	
	public L5_10(){
		panel_1=new JPanel();
		panel_2=new JPanel();
		
		label_1=new JLabel("Birthplace");
		label_2=new JLabel("Education");
		
		
		
		String [] birthplace={"China","US","UK","Australia","Singapore"};
		boxes=new JComboBox(birthplace);
		
		String [] education={"High School","Bachelor","Master","Doctor","Profesor"};
		list=new JList(education);
		list.setVisibleRowCount(3);
		
		
		sp=new JScrollPane(list);
		
		
		panel_1.add(label_1);	panel_1.add(boxes);
		panel_2.add(label_2);	panel_2.add(sp);
		
		this.setLayout(new GridLayout(2,1));
		
		this.add(panel_1);
		this.add(panel_2);
		
		this.setTitle("Search");
		this.setLocation(260, 300);
		this.setSize(300, 200);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
