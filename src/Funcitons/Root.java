package Funcitons;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Root {
	public static void main(String[] args) throws Exception{
		
		Food1 management=new Food1();
		BufferedReader sr=new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			System.out.println("Please choose the function number:");
			System.out.println("Adding food please enter 1");
			System.out.println("Searching food information please enter 2");
			System.out.println("Modify food price please enter 3");
			System.out.println("Delete food enter 4");
			System.out.println("Exit please enter 0");
			
			String str=sr.readLine();
			if (str.equals("1")){
				System.out.println("please input food ID:");
				int id=Integer.parseInt(sr.readLine());
				System.out.println("please input food name:");
				String name=sr.readLine();
				System.out.println("please input food price:");
				float price=Float.parseFloat(sr.readLine());
				
				Foods food_1=new Foods(id,name,price);
				management.addfood(food_1);
			}
			
			else if(str.equals("2")){
				System.out.println("please input food ID:");
				int id=Integer.parseInt(sr.readLine());
				
				management.foodquery(id);

			}
			
			else if(str.equals("3")){
				System.out.println("please input food ID:");
				int id=Integer.parseInt(sr.readLine());
				System.out.println("please input new food price:");
				float price=Float.parseFloat(sr.readLine());
				
				management.foodmodify(id,price);

			}
			
			else if(str.equals("4")){
				System.out.println("please input food ID:");
				int id=Integer.parseInt(sr.readLine());

				management.fooddelete(id);

			}
			
			else if(str.equals("0")){
				System.out.println("Thanks for using, goodbye!");
				System.exit(0);
			}
			
			else{
				System.out.println("Wrong Input!");
			}
		}

	}
}
