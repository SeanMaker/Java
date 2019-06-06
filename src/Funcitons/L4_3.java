package Funcitons;

import java.util.LinkedList;

public class L4_3 {
	public static void main(String[] args){
		LinkedList bb=new LinkedList();
		
		Foods fd1=new Foods(001, "apple",1.1f);
		Foods fd2=new Foods(002, "banana",0.54f);
		
		//bb.addFirst(fd1); //last in, first out
		//bb.addFirst(fd2);
		
		bb.addLast(fd1);
		bb.addLast(fd2);
		
		int i;
		for(i=0;i<bb.size();i++){
			System.out.println(((Foods)bb.get(i)).getFoodid()); 
			System.out.println(((Foods)bb.get(i)).getFoodname());
			System.out.println(((Foods)bb.getFirst()).getFoodprice());
		}
		

		
	}
}
