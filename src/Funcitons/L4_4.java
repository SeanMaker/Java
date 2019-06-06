package Funcitons;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class L4_4 {
	public static void main(String[] args){
	
	/*Vector vv=new Vector();
	
	Foods fd1=new Foods(001, "apple",10f);
	Foods fd2=new Foods(002, "banana",20f);
	
	vv.add(fd1);
	vv.add(fd2);
	
	int i;
	for(i=0;i<vv.size();i++){
		System.out.println(((Foods)vv.get(i)).getFoodid()); 
		System.out.println(((Foods)vv.get(i)).getFoodname());
	*/
		
		/*Stack ss=new Stack();
		
		Foods fd1=new Foods(001, "apple",10f);
		Foods fd2=new Foods(002, "banana",20f);
		
		ss.add(fd1);
		ss.add(fd2);
	
		int i;
		for(i=0;i<ss.size();i++){
			System.out.println(((Foods)ss.get(i)).getFoodid()); 
			System.out.println(((Foods)ss.get(i)).getFoodname());
			
			*/
		
		HashMap hash=new HashMap();
		
		Foods fd1=new Foods(001, "apple",10f);
		Foods fd2=new Foods(002, "banana",20f);
		Foods fd3=new Foods(003, "watermelon",30f);
		
		hash.put(001, fd1);
		hash.put(002, fd2);
		hash.put(002, fd3);
		
		/*System.out.println(((Foods)hash.get(001)).getFoodid());
		System.out.println(((Foods)hash.get(001)).getFoodname()); 
		System.out.println(((Foods)hash.get(001)).getFoodprice());
		*/
		//int i;
		//for(i=0;i<hash.size();i++){
			//System.out.println(((Foods)hash.get(i)).getFoodid()); 
			//System.out.println(((Foods)hash.get(i)).getFoodname());
		
		Iterator iterator=hash.keySet().iterator();
		while(iterator.hasNext()){
			int key=(Integer) iterator.next();
			Foods fd=(Foods)hash.get(key);
			System.out.println(fd.getFoodid()); 
			System.out.println(fd.getFoodname());
			System.out.println(fd.getFoodprice());
			
		}
	}
	
	
}

