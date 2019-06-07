package programs;

class Cat{
	String name;
	int age;
	String color;
	public void set(String name,int age,String color){
		this.name=name;
		this.age=age;
		this.color=color;
	}
	
	public String toString(){
		return "name:"+name+"\tage:"+age+"\tcolor:"+color;
	}
	
	public Cat copy(){
		return this;
	}
}
public class T2 {
	public static void main(String[] args){
		Cat oneCat=new Cat();
		Cat twoCat=new Cat();
		oneCat.set("First",6,"black");
		twoCat.set("Second",7,"white");
		System.out.println(oneCat);
		System.out.println(twoCat);
		
		Cat thirdCat=new Cat();
		thirdCat=twoCat.copy();
		System.out.println(thirdCat);
		
	}
}
