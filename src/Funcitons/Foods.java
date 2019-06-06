package Funcitons;

public class Foods {
	private int foodid;
	private String foodname;
	private float foodprice;
	
	Foods(int foodid,String foodname,float foodprice){
		this.foodid=foodid;
		this.foodname=foodname;
		this.foodprice=foodprice;
	}
	
	public int getFoodid(){
		return foodid;
	}
	
	public void setFoodid(int foodid){
		this.foodid=foodid;
	}
	
	public String getFoodname(){
		return foodname;
	}
	
	public void setFoodname(String foodname){
		this.foodname=foodname;
	}
	
	public float getFoodprice(){
		return foodprice;
	}
	

	public void setFoodprice(float foodprice){
		this.foodprice=foodprice;
	}
	

}
