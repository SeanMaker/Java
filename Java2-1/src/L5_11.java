import java.awt.*;
import javax.swing.*;

public class L5_11 extends JFrame{
	JLabel lable1;
	JList list;
	JSplitPane split;
	
	public static void main(String[] args){
		L5_11 windows=new L5_11();
	}
	
	public L5_11() {
		// TODO Auto-generated constructor stub
		String [] items={"Software Development","Game Development","Graphic Design","Anime Design"};
		list=new JList(items);
		
		lable1=new JLabel(new ImageIcon("images/006hosgngy1fvr65awkcij30xc1ee123.jpg"));
		
		split=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,list,lable1);//devide the windows
		
		split.setOneTouchExpandable(true);//touch arrow to hide the list
		
		this.add(split);
		
		this.setTitle("Window");
		this.setLocation(260, 300);
		this.setSize(1080, 720);
		//this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
