import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.lang.Thread.State;

public class L5_14 extends JFrame{
	JMenuBar menuBar;
	JMenu menu_file,menu_edit,menu_form,menu_check,menu_help;
	JMenuItem  item_2,item_3,item_4,item_5,item_6,item_7;
	JMenu secondary; JMenuItem secondary_item_1,secondary_item_2;
	
	JToolBar toolBar;
	JButton bt1_newpage,bt2_folder,bt3_save,bt4_cut,bt5_copy,bt6_past;
	
	JTextArea textArea;
	JScrollPane scrollPane;
	
	public static void main(String[] args){
		L5_14 notepad= new L5_14();
	}

	public L5_14(){
		menuBar=new JMenuBar();
		
		menu_file=new JMenu("File");
		//menu_file.setMnemonic('F'); 设置助记符，字符加下划线
		menu_edit=new JMenu("Edit");
		menu_form=new JMenu("Format");
		menu_check=new JMenu("View");
		menu_help=new JMenu("Help");
		
		item_2=new JMenuItem("Open File"); //item_2=new JMenuItem("Open File",new ImageIcon("images/**.jpg"));
		item_3=new JMenuItem("Save");
		item_4=new JMenuItem("Save As");
		item_5=new JMenuItem("Page Setup");
		item_6=new JMenuItem("Print");
		item_7=new JMenuItem("Exit");
		
		secondary= new JMenu("New");
		secondary_item_1=new JMenuItem("New Page");
		secondary_item_2=new JMenuItem("Class");
		
		secondary.add(secondary_item_1); secondary.add(secondary_item_2);
		menu_file.add(secondary);
		menu_file.add(item_2); menu_file.add(item_3); menu_file.add(item_4);
		menu_file.add(item_5); menu_file.add(item_6); menu_file.add(item_7);
		
		
		menuBar.add(menu_file); menuBar.add(menu_edit);menuBar.add(menu_form);
		menuBar.add(menu_check);menuBar.add(menu_help);
		
		toolBar=new JToolBar();
		
		bt1_newpage=new JButton("New");
		bt1_newpage.setToolTipText("新建");
		bt2_folder=new JButton("Open");
		bt2_folder.setToolTipText("打开");
		bt3_save=new JButton("Save");
		bt3_save.setToolTipText("保存");
		bt4_cut=new JButton("Cut");
		bt4_cut.setToolTipText("剪切");
		bt5_copy=new JButton("Copy");
		bt5_copy.setToolTipText("复制");
		bt6_past=new JButton("Past");
		bt6_past.setToolTipText("粘贴");
		
		toolBar.add(bt1_newpage); toolBar.add(bt2_folder); toolBar.add(bt3_save);
		toolBar.add(bt4_cut); toolBar.add(bt5_copy); toolBar.add(bt6_past);
		
	
		textArea=new JTextArea();
		scrollPane=new JScrollPane(textArea);
	
		
		this.setJMenuBar(menuBar);
		this.add(toolBar,BorderLayout.NORTH);
		this.add(scrollPane);
		
		
		this.setTitle("Note");
		//this.setIconImage((new ImageIcon("images/Axialis-Icon-Workshop-icon.png").getImage()));
		this.setLocation(260, 300);
		this.setSize(500,600);
		//this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
