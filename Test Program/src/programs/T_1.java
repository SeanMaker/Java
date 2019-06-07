package programs;

public class T_1 {
	public static void main(String[] args){
		Person MyPerson=new Person();
		
		System.out.println(MyPerson.name);
		
		MyPerson.eat();
		MyPerson.sleep("home");
		int age=MyPerson.getAge(18);
		System.out.println(age);
		System.out.println(MyPerson.gender);
		
		Dog A1=new Dog();
		
		String name=A1.print("Puppy");
		System.out.println(name);
		
		
	}
}
