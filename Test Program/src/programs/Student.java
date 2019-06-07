package programs;

public class Student {

	String name;
	static String country;
	int age;
	
	Student(String name) {
		this.name=name;
		System.out.println(name);
	}
	
	Student(String name, int age){
		this(name);
		this.age=age;
		System.out.println(age);
	}
	
	Student(String name, int age,String country){
		this(name,age);
		this.country=country;
		System.out.println(country);
	}
	
	static void print(){
		System.out.println(country);
		
	}
	
	
	public static void main(String[] args){
		Student stu1=new Student("Madeleine");
		Student stu2=new Student("Sharon",17);
		Student stu3=new Student("Linda",19,"America");
		stu1.print();
		
		String main="123";
		System.out.println(main);
		
	}
}

