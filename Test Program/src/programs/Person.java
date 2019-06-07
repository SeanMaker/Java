package programs;

public class Person {
	
	String name="Madeleine";
	String gender;
	int age;
	
	public void eat(){
		System.out.println("I'm having lunch.");
	}
	
	public void sleep(String A){
		System.out.println("I'm sleepig at "+A);
	}
	
	public int getAge(int a){
		return a;
	}
}


class Dog{
	String name;
	public String print(String n){
		System.out.println(n);
		return n;
	}
}