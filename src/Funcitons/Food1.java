package Funcitons;

import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Food1 {
	private ArrayList foodim=null;
	Food1(){
		foodim=new ArrayList();
	}
	
	public void addfood(Foods fd){
		foodim.add(fd);
		System.out.println("Adding new food information successfully.");
	}
	
	
	public void foodquery(int id){
		int i;
		for (i=0;i<foodim.size();i++){
			
			Foods fd=(Foods)foodim.get(i);
			if(fd.getFoodid()==id){
				System.out.println("The information of the food is:");
				System.out.println("Food ID is:"+id);
				System.out.println("Food name is:"+fd.getFoodname());
				System.out.println("Food price is:"+fd.getFoodprice());
				break;
			}
			
			}
		if(i==foodim.size()){
			System.out.println("Sorry,the food doesn't exist!");
		}
	}


	public void foodmodify(int id,float new_price){
		int i;
		for(i=0;i<foodim.size();i++){
			
			Foods fd=(Foods)foodim.get(i);
			if(fd.getFoodid()==id){
				fd.setFoodprice(new_price);
				System.out.println("The food price changed.");
				break;				
			}
			
			}
		if(i==foodim.size()){
			System.out.println("Sorry,the food doesn't exist!");
		}
	}
	public void fooddelete(int id){
		int i;
		if (foodim.size()==0){
			System.out.println("Sorry,the storehouse is empty!");
		}
		
		for(i=0;i<foodim.size();i++){
			
			Foods fd=(Foods)foodim.get(i);
			if(fd.getFoodid()==id){
				foodim.remove(i);
				System.out.println("Delete Successfully!");
				break;
			}
			
			}
		if(i==foodim.size()&&foodim.size()!=0){
			System.out.println("Sorry,the food doesn't exist!");
		}
	}	
	
	}
